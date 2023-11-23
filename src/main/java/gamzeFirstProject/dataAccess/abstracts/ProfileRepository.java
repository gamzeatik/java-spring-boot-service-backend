package gamzeFirstProject.dataAccess.abstracts;

import gamzeFirstProject.entities.concretes.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile,Integer> {
//    Profile getById(int profileId);
//    List<Profile> getAll();
//    void add(Profile profile);
//    void update(Profile profile);
//    void delete(int profileId);
}
