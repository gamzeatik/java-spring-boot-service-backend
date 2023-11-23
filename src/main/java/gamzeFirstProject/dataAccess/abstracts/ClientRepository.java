package gamzeFirstProject.dataAccess.abstracts;

import gamzeFirstProject.business.responses.GetAllClientsResponses;
import gamzeFirstProject.entities.concretes.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Integer> {
//    Client getById(int clientId);
//    List<Client> getAll();
//    void add(Client client);
//    void update(Client client);
//    void delete(int clientId);
}
