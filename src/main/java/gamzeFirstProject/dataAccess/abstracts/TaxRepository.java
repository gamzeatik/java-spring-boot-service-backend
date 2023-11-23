package gamzeFirstProject.dataAccess.abstracts;

import gamzeFirstProject.entities.concretes.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxRepository extends JpaRepository<Tax,Integer> {
//    Tax getById(int taxId);
//    List<Tax> getAll();
//    void add(Tax tax);
//    void update(Tax tax);
//    void delete(int taxId);
}
