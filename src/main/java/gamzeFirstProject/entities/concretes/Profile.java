package gamzeFirstProject.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "profiles")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    @NotNull
    @NotEmpty
    private int profileId;

    @Column(name = "profile_name")
    private String profileName;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "profile_mail")
    private String profileMail;

    @Column(name = "profile_number")
    private String profileNumber;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

//    public Profile() {
//    }
//
//    public Profile(int profileId, String profileName, String profilePicture, String profileMail, String profileNumber,Invoice invoice) {
//        this.profileId = profileId;
//        this.profileName = profileName;
//        this.profilePicture = profilePicture;
//        this.profileMail = profileMail;
//        this.profileNumber = profileNumber;
//        this.invoice=invoice;
//    }
//
//    public int getProfileId() {
//        return profileId;
//    }
//
//    public void setProfileId(int profileId) {
//        this.profileId = profileId;
//    }
//
//    public String getProfileName() {
//        return profileName;
//    }
//
//    public void setProfileName(String profileName) {
//        this.profileName = profileName;
//    }
//
//    public String getProfilePicture() {
//        return profilePicture;
//    }
//
//    public void setProfilePicture(String profilePicture) {
//        this.profilePicture = profilePicture;
//    }
//
//    public String getProfileMail() {
//        return profileMail;
//    }
//
//    public void setProfileMail(String profileMail) {
//        this.profileMail = profileMail;
//    }
//
//    public String getProfileNumber() {
//        return profileNumber;
//    }
//
//    public void setProfileNumber(String profileNumber) {
//        this.profileNumber = profileNumber;
//    }
//
//    public Invoice getInvoice() {
//        return invoice;
//    }
//
//    public void setInvoice(Invoice invoice) {
//        this.invoice = invoice;
//    }
}
