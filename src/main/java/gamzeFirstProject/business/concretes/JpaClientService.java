package gamzeFirstProject.business.concretes;
import gamzeFirstProject.business.abstracts.ClientService;
import gamzeFirstProject.business.requests.CreateClientRequest;
import gamzeFirstProject.business.requests.UpdateClientRequest;
import gamzeFirstProject.business.responses.GetAllClientsResponses;
import gamzeFirstProject.business.responses.GetByIdClientResponses;
import gamzeFirstProject.core.utilities.mappers.ModelMapperServices;
import gamzeFirstProject.dataAccess.abstracts.ClientRepository;
import gamzeFirstProject.entities.concretes.Client;
import gamzeFirstProject.entities.concretes.Invoice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class JpaClientService implements ClientService {

    private ClientRepository clientRepository;
    private ModelMapperServices modelMapperServices;

    @Override
    public List<GetAllClientsResponses> getAllClient() {
        List<Client> clients = clientRepository.findAll();
        List<GetAllClientsResponses> clientsResponse= clients.stream()
                .map(client -> this.modelMapperServices.forResponse()
                        .map(client,GetAllClientsResponses.class)).collect(Collectors.toList());
        return clientsResponse;
    }

    @Override
    public void addClient(CreateClientRequest createClientRequest) {
        Client client=this.modelMapperServices.forRequest().map(createClientRequest,Client.class);
        this.clientRepository.save(client);
    }

    @Override
    public void updateClient(UpdateClientRequest updateClientRequest) {
        Client client=this.modelMapperServices.forRequest().map(updateClientRequest,Client.class);
        this.clientRepository.save(client);
    }

    @Override
    public void deleteClient(int clientId) {
        this.clientRepository.deleteById(clientId);
    }

    @Override
    public GetByIdClientResponses getByIdClient(int clientId) {
        Client client= this.clientRepository.findById(clientId).orElseThrow();
        GetByIdClientResponses response=this.modelMapperServices.forResponse().map(client,GetByIdClientResponses.class);
        return response;
    }


    @Override
    public List<Invoice> getInvoicesForClient(int clientId) {
        Client client = clientRepository.getById(clientId);
        if (client != null) {
            return client.getInvoices();
        } else {
            return Collections.emptyList();
        }
    }
}
