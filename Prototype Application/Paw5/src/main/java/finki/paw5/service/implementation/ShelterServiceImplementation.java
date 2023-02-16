package finki.paw5.service.implementation;

import finki.paw5.model.entities.Shelter;
import finki.paw5.repository.ShelterRepository;
import finki.paw5.service.ShelterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterServiceImplementation implements ShelterService {
    private final ShelterRepository shelterRepository;

    public ShelterServiceImplementation(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }


    @Override
    public List<Shelter> listShelters() {
        return shelterRepository.findAll();
    }
}
