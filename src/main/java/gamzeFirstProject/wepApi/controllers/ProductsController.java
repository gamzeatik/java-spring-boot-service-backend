package gamzeFirstProject.wepApi.controllers;
import gamzeFirstProject.business.abstracts.ProductService;
import gamzeFirstProject.business.requests.CreateProductRequest;
import gamzeFirstProject.business.requests.UpdateProductRequest;
import gamzeFirstProject.business.responses.GetAllProductsResponses;
import gamzeFirstProject.business.responses.GetByIdProductResponses;
import gamzeFirstProject.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {

    private final ProductService productService;

    @GetMapping("/{productId}")
    public GetByIdProductResponses getProductById(@PathVariable int productId) {
        return productService.getByIdProduct(productId);
    }

    @GetMapping
    public List<GetAllProductsResponses> getAllProducts() {
        return productService.getAllProduct();
    }

    @PostMapping
    public void addProduct(@RequestBody() CreateProductRequest createProductRequest) {
        this.productService.addProduct(createProductRequest);
    }

    @PutMapping
    public void updateProduct(@RequestBody() UpdateProductRequest updateProductRequest) {
       this.productService.updateProduct(updateProductRequest);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable int productId) {
        this.productService.deleteProduct(productId);
    }
}

