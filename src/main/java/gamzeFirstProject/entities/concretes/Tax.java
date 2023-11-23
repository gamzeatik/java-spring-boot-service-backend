package gamzeFirstProject.entities.concretes;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "taxes")
@Data
@AllArgsConstructor //parametreli
@NoArgsConstructor  //parametresiz constructor caliscam
@Getter
@Setter
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tax_id")
    @NotNull
    @NotEmpty
    private int taxId;

    @Column(name = "tax_rate")
    private int taxRate;

    @Column(name = "tax_name")
    private String taxName;

//    public Tax() {
//    }
//
//    public Tax(int taxId, int taxRate, String taxName) {
//        this.taxId = taxId;
//        this.taxRate = taxRate;
//        this.taxName = taxName;
//    }
//
//    public int getTaxId() {
//        return taxId;
//    }
//
//    public void setTaxId(int taxId) {
//        this.taxId = taxId;
//    }
//
//    public int getTaxRate() {
//        return taxRate;
//    }
//
//    public void setTaxRate(int taxRate) {
//        this.taxRate = taxRate;
//    }
//
//    public String getTaxName() {
//        return taxName;
//    }
//
//    public void setTaxName(String taxName) {
//        this.taxName = taxName;
//    }
}
