//package gamzeFirstProject.dataAccess.concretes;
//
//import gamzeFirstProject.dataAccess.abstracts.TaxRepository;
//import gamzeFirstProject.entities.concretes.Tax;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JpaTaxRepository implements TaxRepository {
//    private final EntityManager entityManager;
//
//    public JpaTaxRepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public Tax getById(int taxId) {
//        return entityManager.find(Tax.class, taxId);
//    }
//
//    @Override
//    public List<Tax> getAll() {
//        Query query = entityManager.createQuery("SELECT t FROM Tax t");
//        return query.getResultList();
//    }
//
//    @Override
//    public void add(Tax tax) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(tax);
//        transaction.commit();
//    }
//
//    @Override
//    public void update(Tax tax) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.merge(tax);
//        transaction.commit();
//    }
//
//    @Override
//    public void delete(int taxId) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        Tax tax = entityManager.find(Tax.class, taxId);
//        if (tax != null) {
//            entityManager.remove(tax);
//        }
//        transaction.commit();
//    }
//}
