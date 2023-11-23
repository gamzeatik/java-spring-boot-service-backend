package gamzeFirstProject.business.responses;

import gamzeFirstProject.entities.concretes.Invoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProfilesResponses {
    private int profileId;
    private String profileName;
    private String profilePicture;
    private String profileMail;
    private String profileNumber;
    private Invoice invoice;
}
