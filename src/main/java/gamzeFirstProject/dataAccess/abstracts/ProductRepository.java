package gamzeFirstProject.dataAccess.abstracts;

import gamzeFirstProject.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
//    Product getById(int productId);
//    List<Product> getAll();
//    void add(Product product);
//    void update(Product product);
//    void delete(int productId);
}
