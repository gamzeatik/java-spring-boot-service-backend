package gamzeFirstProject.business.concretes;

import gamzeFirstProject.business.abstracts.ProfileService;
import gamzeFirstProject.business.requests.CreateProfileRequest;
import gamzeFirstProject.business.requests.UpdateProfileRequest;
import gamzeFirstProject.business.responses.GetAllClientsResponses;
import gamzeFirstProject.business.responses.GetAllProfilesResponses;
import gamzeFirstProject.business.responses.GetByIdClientResponses;
import gamzeFirstProject.business.responses.GetByIdProfileResponses;
import gamzeFirstProject.core.utilities.mappers.ModelMapperServices;
import gamzeFirstProject.dataAccess.abstracts.ProfileRepository;
import gamzeFirstProject.entities.concretes.Client;
import gamzeFirstProject.entities.concretes.Profile;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class JpaProfileService implements ProfileService {
    private final ProfileRepository profileRepository;
    private ModelMapperServices modelMapperServices;


    @Override
    public GetByIdProfileResponses getByIdProfile(int profileId) {
        Profile profile= this.profileRepository.findById(profileId).orElseThrow();
        GetByIdProfileResponses response=this.modelMapperServices.forResponse().map(profile,GetByIdProfileResponses.class);
        return response;
    }

    @Override
    public List<GetAllProfilesResponses> getAllProfiles() {
        List<Profile> profiles = profileRepository.findAll();
        List<GetAllProfilesResponses> profilesResponse= profiles.stream()
                .map(profile -> this.modelMapperServices.forResponse()
                        .map(profile,GetAllProfilesResponses.class)).collect(Collectors.toList());
        return profilesResponse;
    }

    @Override
    public void addProfile(CreateProfileRequest createProfileRequest) {
        Profile profile = this.modelMapperServices.forRequest().map(createProfileRequest,Profile.class);
        this.profileRepository.save(profile);
    }

    @Override
    public void deleteProfile(int profileId) {
        this.profileRepository.deleteById(profileId);
    }

    @Override
    public void updateProfile(UpdateProfileRequest updateProfileRequest) {
        Profile profile=this.modelMapperServices.forRequest().map(updateProfileRequest,Profile.class);
        this.profileRepository.save(profile);
    }
}
