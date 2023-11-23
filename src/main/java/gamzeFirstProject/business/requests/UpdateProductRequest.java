package gamzeFirstProject.business.requests;

import gamzeFirstProject.entities.concretes.Invoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    private int productId;
    private String productName;
    private String productPicture;
    private double productPrice;
    private List<String> unitTypes;
    private Invoice invoice;
}
