//package gamzeFirstProject.dataAccess.concretes;
//
//import gamzeFirstProject.dataAccess.abstracts.ClientRepository;
//import gamzeFirstProject.entities.concretes.Client;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JpaClientRepository implements ClientRepository {
//    private final EntityManager entityManager;
//
//    public JpaClientRepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public Client getById(int clientId) {
//        return entityManager.find(Client.class, clientId);
//    }
//
//    @Override
//     public List<Client> getAll() {
//        Query query=entityManager.createQuery("SELECT c from Client c");
//        return query.getResultList();
//    }
//
//    @Override
//    public void add(Client client) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(client);
//        transaction.commit();
//    }
//
//    @Override
//    public void update(Client client) {
//        EntityTransaction transaction=entityManager.getTransaction();
//        transaction.begin();
//        entityManager.merge(client);
//        transaction.commit();
//    }
//
//    @Override
//    public void delete(int clientId) {
//        EntityTransaction transaction=entityManager.getTransaction();
//        transaction.begin();
//        Client client=entityManager.find(Client.class,clientId);
//        if (client !=null){
//            entityManager.remove(client);
//        }
//        transaction.commit();
//    }
//}
