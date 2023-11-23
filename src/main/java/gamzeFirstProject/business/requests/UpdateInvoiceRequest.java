package gamzeFirstProject.business.requests;

import gamzeFirstProject.entities.concretes.Client;
import gamzeFirstProject.entities.concretes.Product;
import gamzeFirstProject.entities.concretes.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInvoiceRequest {
    private int invoiceId;
    Date invoiceDate;
    Date invoiceDeadline;
    private List<Product> products;
    double quantity;
    private Profile profile;
    private Client client;
    double invoicePrice;
}
