package finki.paw5.service;

import finki.paw5.model.entities.PersonalProfile;
import finki.paw5.web.controllers.PostController;

import java.util.Optional;

public interface PersonalProfileService {
    Optional<PersonalProfile> findById(Integer petId);
}
