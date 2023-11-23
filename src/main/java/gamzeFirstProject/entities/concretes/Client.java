package gamzeFirstProject.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "clients")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    @NotNull
    @NotEmpty
    private int clientId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_picture")
    private String clientPicture;

    @Column(name = "client_mail")
    private String clientMail;

    @Column(name = "client_number")
    private String clientNumber;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Invoice> invoices;

//    public Client() {
//    }
//
//    public Client(int clientId, String clientName, String clientPicture, String clientMail, String clientNumber,List<Invoice> invoices) {
//        this.clientId = clientId;
//        this.clientName = clientName;
//        this.clientPicture = clientPicture;
//        this.clientMail = clientMail;
//        this.clientNumber = clientNumber;
//        this.invoices=invoices;
//    }
//
//    public int getClientId() {
//        return clientId;
//    }
//
//    public void setClientId(int clientId) {
//        this.clientId = clientId;
//    }
//
//    public String getClientName() {
//        return clientName;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    public String getClientPicture() {
//        return clientPicture;
//    }
//
//    public void setClientPicture(String clientPicture) {
//        this.clientPicture = clientPicture;
//    }
//
//    public String getClientMail() {
//        return clientMail;
//    }
//
//    public void setClientMail(String clientMail) {
//        this.clientMail = clientMail;
//    }
//
//    public String getClientNumber() {
//        return clientNumber;
//    }
//
//    public void setClientNumber(String clientNumber) {
//        this.clientNumber = clientNumber;
//    }
//
//    public List<Invoice> getInvoices() {
//        return invoices;
//    }
//
//    public void setInvoices(List<Invoice> invoices) {
//        this.invoices = invoices;
//    }
}
