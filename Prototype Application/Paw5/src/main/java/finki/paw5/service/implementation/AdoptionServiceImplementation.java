package finki.paw5.service.implementation;

import finki.paw5.model.entities.Adoption;
import finki.paw5.repository.AdoptionRepository;
import finki.paw5.service.AdoptionService;
import org.springframework.stereotype.Service;

@Service
public class AdoptionServiceImplementation implements AdoptionService {

    private final AdoptionRepository adoptionRepository;

    public AdoptionServiceImplementation(AdoptionRepository adoptionRepository) {
        this.adoptionRepository = adoptionRepository;
    }

    @Override
    public void save(Adoption adoption) {
        this.adoptionRepository.save(adoption);
    }
}
