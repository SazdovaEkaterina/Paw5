package finki.paw5.service.implementation;

import finki.paw5.repository.PetRepository;
import finki.paw5.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImplementation implements PetService {

    private final PetRepository petRepository;

    public PetServiceImplementation(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

}
