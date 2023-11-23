package gamzeFirstProject.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    @NotNull
    @NotEmpty
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_picture")
    private String productPicture;

    @Column(name = "product_price")
    private double productPrice;

    @ElementCollection
    @CollectionTable(name = "product_unit_types", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "unit_type")
    private List<String> unitTypes;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

//    public Product() {
//    }
//
//    public Product(int productId, String productName, String productPicture, double productPrice, List<String> unitTypes,Invoice invoice) {
//        this.productId = productId;
//        this.productName = productName;
//        this.productPicture = productPicture;
//        this.productPrice = productPrice;
//        this.unitTypes = unitTypes;
//        this.invoice = invoice;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public String getProductPicture() {
//        return productPicture;
//    }
//
//    public void setProductPicture(String productPicture) {
//        this.productPicture = productPicture;
//    }
//
//    public double getProductPrice() {
//        return productPrice;
//    }
//
//    public void setProductPrice(double productPrice) {
//        this.productPrice = productPrice;
//    }
//
//    public List<String> getUnitTypes() {
//        return unitTypes;
//    }
//
//    public void setUnitTypes(List<String> unitTypes) {
//        this.unitTypes = unitTypes;
//    }
//    public Invoice getInvoice() {
//        return invoice;
//    }
//
//    public void setInvoice(Invoice invoice) {
//        this.invoice = invoice;
//    }
}
