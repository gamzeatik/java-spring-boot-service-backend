package gamzeFirstProject.business.requests;

import gamzeFirstProject.entities.concretes.Invoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateClientRequest {
    private int clientId;
    private String clientName;
    private String clientPicture;
    private String clientMail;
    private String clientNumber;
    private List<Invoice> invoices;
}
