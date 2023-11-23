package gamzeFirstProject.wepApi.controllers;
import gamzeFirstProject.business.abstracts.ProfileService;
import gamzeFirstProject.business.requests.CreateProfileRequest;
import gamzeFirstProject.business.requests.UpdateProfileRequest;
import gamzeFirstProject.business.responses.GetAllProfilesResponses;
import gamzeFirstProject.business.responses.GetByIdProfileResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
@AllArgsConstructor
public class ProfilesController {

    private final ProfileService profileService;

    @GetMapping("/{profileId}")
    public GetByIdProfileResponses getProfileById(@PathVariable int profileId) {
       return profileService.getByIdProfile(profileId);
    }

    @GetMapping
    public List<GetAllProfilesResponses> getAllProfiles() {
       return profileService.getAllProfiles();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addProfile(@RequestBody() CreateProfileRequest createProfileRequest) {
        this.profileService.addProfile(createProfileRequest);
    }

    @PutMapping
    public void updateProfile(@RequestBody() UpdateProfileRequest updateProfileRequest) {
       this.profileService.updateProfile(updateProfileRequest);
    }

    @DeleteMapping("/{profileId}")
    public void deleteProfile(@PathVariable int profileId) {
        this.profileService.deleteProfile(profileId);
    }
}

