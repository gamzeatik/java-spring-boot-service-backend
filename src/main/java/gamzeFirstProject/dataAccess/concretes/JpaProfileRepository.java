//package gamzeFirstProject.dataAccess.concretes;
//
//import gamzeFirstProject.dataAccess.abstracts.ProfileRepository;
//import gamzeFirstProject.entities.concretes.Profile;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JpaProfileRepository implements ProfileRepository {
//    private final EntityManager entityManager;
//
//    public JpaProfileRepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public Profile getById(int profileId) {
//        return entityManager.find(Profile.class, profileId);
//    }
//
//    @Override
//    public List<Profile> getAll() {
//        Query query = entityManager.createQuery("SELECT p FROM Profile p");
//        return query.getResultList();
//    }
//
//    @Override
//    public void add(Profile profile) {
//        EntityTransaction transaction = null;
//        try {
//            transaction = entityManager.getTransaction();
//            transaction.begin();
//            entityManager.persist(profile);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//
//    @Override
//    public void update(Profile profile) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.merge(profile);
//        transaction.commit();
//    }
//
//    @Override
//    public void delete(int profileId) {
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        Profile profile = entityManager.find(Profile.class, profileId);
//        if (profile != null) {
//            entityManager.remove(profile);
//        }
//        transaction.commit();
//    }
//}
