//package gamzeFirstProject.dataAccess.concretes;
//
//import gamzeFirstProject.dataAccess.abstracts.ProductRepository;
//import gamzeFirstProject.entities.concretes.Product;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JpaProductRepository implements ProductRepository {
//    private final EntityManager entityManager;
//
//    public JpaProductRepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public Product getById(int productId) {
//        return entityManager.find(Product.class, productId);
//    }
//
//    @Override
//    public List<Product> getAll() {
//        Query query = entityManager.createQuery("SELECT p FROM Product p");
//        return query.getResultList();
//    }
//
//    @Override
//    public void add(Product product) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(product);
//        transaction.commit();
//    }
//
//    @Override
//    public void update(Product product) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.merge(product);
//        transaction.commit();
//    }
//
//    @Override
//    public void delete(int productId) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        Product product = entityManager.find(Product.class, productId);
//        if (product != null) {
//            entityManager.remove(product);
//        }
//        transaction.commit();
//    }
//}
