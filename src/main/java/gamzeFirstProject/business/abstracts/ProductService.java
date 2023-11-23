package gamzeFirstProject.business.abstracts;

import gamzeFirstProject.business.requests.CreateProductRequest;
import gamzeFirstProject.business.requests.UpdateProductRequest;
import gamzeFirstProject.business.responses.GetAllProductsResponses;
import gamzeFirstProject.business.responses.GetByIdProductResponses;
import gamzeFirstProject.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    GetByIdProductResponses getByIdProduct(int productId);
    List<GetAllProductsResponses> getAllProduct();
    void addProduct(CreateProductRequest createProductRequest);
    void deleteProduct(int productId);
    void updateProduct(UpdateProductRequest updateProductRequest);
}
