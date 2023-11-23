package gamzeFirstProject.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdTaxResponses {
    private int taxId;
    private int taxRate;
    private String taxName;
}