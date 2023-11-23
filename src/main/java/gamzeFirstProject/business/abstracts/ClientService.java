package gamzeFirstProject.business.abstracts;

import gamzeFirstProject.business.requests.CreateClientRequest;
import gamzeFirstProject.business.requests.UpdateClientRequest;
import gamzeFirstProject.business.responses.GetAllClientsResponses;
import gamzeFirstProject.business.responses.GetByIdClientResponses;
import gamzeFirstProject.entities.concretes.Invoice;

import java.util.List;

public interface ClientService {
    List<GetAllClientsResponses> getAllClient();
    void addClient(CreateClientRequest createClientRequest);
    void updateClient(UpdateClientRequest updateClientRequest);
    void deleteClient(int clientId);
    GetByIdClientResponses getByIdClient(int clientId);
    List<Invoice> getInvoicesForClient(int clientId);
}
