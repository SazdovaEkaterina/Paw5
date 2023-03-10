package finki.paw5.service.implementation;

import finki.paw5.model.entities.Pet;
import finki.paw5.repository.PetRepository;
import finki.paw5.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Pet> listpets() {return this.petRepository.findAll();}

    @Override
    public Pet findById(Integer id) {
        return this.petRepository.findById(id).get();
    }
}
