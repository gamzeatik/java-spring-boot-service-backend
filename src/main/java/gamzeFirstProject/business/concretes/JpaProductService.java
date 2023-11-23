package gamzeFirstProject.business.concretes;
import gamzeFirstProject.business.abstracts.ProductService;
import gamzeFirstProject.business.requests.CreateProductRequest;
import gamzeFirstProject.business.requests.UpdateProductRequest;
import gamzeFirstProject.business.responses.GetAllProductsResponses;
import gamzeFirstProject.business.responses.GetByIdProductResponses;
import gamzeFirstProject.core.utilities.mappers.ModelMapperServices;
import gamzeFirstProject.dataAccess.abstracts.ProductRepository;
import gamzeFirstProject.entities.concretes.Product;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class JpaProductService implements ProductService {

    private ProductRepository productRepository;
    private ModelMapperServices modelMapperServices;

    @Override
    public GetByIdProductResponses getByIdProduct(int productId) {
        Product product = this.productRepository.findById(productId).orElseThrow();
        GetByIdProductResponses responses = this.modelMapperServices.forResponse().map(product,GetByIdProductResponses.class);
        return responses;
    }

    @Override
    public List<GetAllProductsResponses> getAllProduct() {
        List<Product> products = productRepository.findAll();
        List<GetAllProductsResponses> productsResponse = products.stream()
                .map(product -> this.modelMapperServices.forResponse()
                        .map(product,GetAllProductsResponses.class)).collect(Collectors.toList());
        return productsResponse;
    }

    @Override
    public void addProduct(CreateProductRequest createProductRequest) {
        Product product = this.modelMapperServices.forRequest().map(createProductRequest,Product.class);
        this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        this.productRepository.deleteById(productId);
    }

    @Override
    public void updateProduct(UpdateProductRequest updateProductRequest) {
        Product product = this.modelMapperServices.forRequest().map(updateProductRequest,Product.class);
        this.productRepository.save(product);
    }
}
