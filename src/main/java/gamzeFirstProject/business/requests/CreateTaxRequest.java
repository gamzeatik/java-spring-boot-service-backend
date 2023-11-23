package gamzeFirstProject.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaxRequest {
    //private int taxId;
    private int taxRate;
    private String taxName;
}
