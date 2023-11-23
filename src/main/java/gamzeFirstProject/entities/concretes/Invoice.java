package gamzeFirstProject.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "invoices")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoiceId")
    @NotNull
    @NotEmpty
    private int invoiceId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "invoice_date")
     Date invoiceDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "invoice_deadline")
     Date invoiceDeadline;
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<Product> products;

    @Column(name = "quantity")
    double quantity;
    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "invoice_price")
     double invoicePrice;

//    public Invoice() {
//    }
//
//    public Invoice(int invoiceId, Date invoiceDate, Date invoiceDeadline, List<Product> products, double quantity, Profile profile, Client client, double invoicePrice) {
//        this.invoiceId = invoiceId;
//        this.invoiceDate = invoiceDate;
//        this.invoiceDeadline = invoiceDeadline;
//        this.products = products;
//        this.quantity = quantity;
//        this.profile = profile;
//        this.client = client;
//        this.invoicePrice = invoicePrice;
//    }
//
//    public int getInvoiceId() {
//        return invoiceId;
//    }
//
//    public void setInvoiceId(int invoiceId) {
//        this.invoiceId = invoiceId;
//    }
//
//    public Date getInvoiceDate() {
//        return invoiceDate;
//    }
//
//    public void setInvoiceDate(Date invoiceDate) {
//        this.invoiceDate = invoiceDate;
//    }
//
//    public Date getInvoiceDeadline() {
//        return invoiceDeadline;
//    }
//
//    public void setInvoiceDeadline(Date invoiceDeadline) {
//        this.invoiceDeadline = invoiceDeadline;
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        products = products;
//    }
//
//    public double getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(double quantity) {
//        this.quantity = quantity;
//    }
//
//    public Profile getProfile() {
//        return profile;
//    }
//
//    public void setProfile(Profile profile) {
//        this.profile = profile;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public double getInvoicePrice() {
//        return invoicePrice;
//    }
//
//    public void setInvoicePrice(double invoicePrice) {
//        this.invoicePrice = invoicePrice;
//    }
}
