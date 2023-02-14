package finki.paw5.service.implementation;

import finki.paw5.model.entities.Pet;
import finki.paw5.repository.PetRepository;
import finki.paw5.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImplementation implements PetService {

    private final PetRepository petRepository;

    public PetServiceImplementation(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public void save(Pet pet) {
        this.petRepository.save(pet);
    }

    @Override
    public List<Pet> findAll() {
        return this.petRepository.findAll();
    }

    @Override
    public Optional<Pet> findById(Integer petId) {
        return this.petRepository.findById(petId);
    }
}
