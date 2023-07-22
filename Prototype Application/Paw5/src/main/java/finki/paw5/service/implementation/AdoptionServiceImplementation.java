package finki.paw5.service.implementation;

import finki.paw5.model.entities.Adoption;
import finki.paw5.model.entities.Pet;
import finki.paw5.repository.AdoptionRepository;
import finki.paw5.service.AdoptionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public Adoption findById(Integer id) {
        return this.adoptionRepository.findById(id).get();
    }

    @Override
    public List<Adoption> findAll() {
        return this.adoptionRepository.findAll();
    }

    @Override
    public List<Adoption> findAllThatNeedApproval() {
        return this.adoptionRepository.findAll().stream()
                .filter(a -> !a.getApproved())
                .collect(Collectors.toList());
    }

    @Override
    public Adoption markApproved(Integer id) {
        Adoption adoption = this.findById(id);
        adoption.setApproved(true);
        this.adoptionRepository.delete(this.findById(id));
        return this.adoptionRepository.save(adoption);
    }
}
