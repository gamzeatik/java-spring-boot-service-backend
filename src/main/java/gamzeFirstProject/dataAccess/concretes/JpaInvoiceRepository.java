//package gamzeFirstProject.dataAccess.concretes;
//
//import gamzeFirstProject.dataAccess.abstracts.InvoiceRepository;
//import gamzeFirstProject.entities.concretes.Invoice;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JpaInvoiceRepository implements InvoiceRepository {
//    private final EntityManager entityManager;
//
//    public JpaInvoiceRepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public Invoice getById(int invoiceId) {
//        return entityManager.find(Invoice.class, invoiceId);
//    }
//
//    @Override
//    public List<Invoice> getAll() {
//        Query query = entityManager.createQuery("SELECT i FROM Invoice i");
//        return query.getResultList();
//    }
//
//    @Override
//    public void add(Invoice invoice) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(invoice);
//        transaction.commit();
//    }
//
//    @Override
//    public void update(Invoice invoice) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.merge(invoice);
//        transaction.commit();
//    }
//
//    @Override
//    public void delete(int invoiceId) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        Invoice invoice = entityManager.find(Invoice.class, invoiceId);
//        if (invoice != null) {
//            entityManager.remove(invoice);
//        }
//        transaction.commit();
//    }
//}
