package finki.paw5.service.implementation;

import finki.paw5.model.entities.PersonalProfile;
import finki.paw5.repository.PersonalProfileRepository;
import finki.paw5.service.PersonalProfileService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonalProfileServiceImplementation implements PersonalProfileService {

    private final PersonalProfileRepository personalProfileRepository;

    public PersonalProfileServiceImplementation(PersonalProfileRepository personalProfileRepository) {
        this.personalProfileRepository = personalProfileRepository;
    }

    @Override
    public Optional<PersonalProfile> findById(Integer petId) {
        return this.personalProfileRepository.findById(petId);
    }
}
