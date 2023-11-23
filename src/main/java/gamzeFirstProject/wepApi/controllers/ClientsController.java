package gamzeFirstProject.wepApi.controllers;

import gamzeFirstProject.business.abstracts.ClientService;
import gamzeFirstProject.business.requests.CreateClientRequest;
import gamzeFirstProject.business.requests.UpdateClientRequest;
import gamzeFirstProject.business.responses.GetAllClientsResponses;
import gamzeFirstProject.business.responses.GetByIdClientResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientsController {

    private final ClientService clientService;

    @GetMapping("/{clientId}")
    public GetByIdClientResponses getClientById(@PathVariable int clientId) {
        return clientService.getByIdClient(clientId);
    }

    @GetMapping
    public List<GetAllClientsResponses> getAllClients() {
        return clientService.getAllClient();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addClient(@RequestBody() CreateClientRequest createClientRequest) {
        this.clientService.addClient(createClientRequest);
    }

    @PutMapping
    public void updateClient(@RequestBody() UpdateClientRequest updateClientRequest) {
        this.clientService.updateClient(updateClientRequest);
    }

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable int clientId) {
        this.clientService.deleteClient(clientId);
    }
}

