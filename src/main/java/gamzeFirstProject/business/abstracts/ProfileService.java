package gamzeFirstProject.business.abstracts;

import gamzeFirstProject.business.requests.CreateProfileRequest;
import gamzeFirstProject.business.requests.UpdateProfileRequest;
import gamzeFirstProject.business.responses.GetAllProfilesResponses;
import gamzeFirstProject.business.responses.GetByIdProfileResponses;

import java.util.List;

public interface ProfileService {
    GetByIdProfileResponses getByIdProfile(int profileId);
    List<GetAllProfilesResponses> getAllProfiles();
    void addProfile(CreateProfileRequest createProfileRequest);
    void deleteProfile(int profileId);
    void updateProfile(UpdateProfileRequest updateProfileRequest);
}
