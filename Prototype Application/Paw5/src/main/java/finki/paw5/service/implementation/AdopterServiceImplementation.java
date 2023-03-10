package finki.paw5.service.implementation;

import finki.paw5.model.entities.Adopter;
import finki.paw5.repository.AdopterRepository;
import finki.paw5.service.AdopterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdopterServiceImplementation implements AdopterService {
    private final AdopterRepository adopterRepository;

    public AdopterServiceImplementation(AdopterRepository adopterRepository) {
        this.adopterRepository = adopterRepository;
    }

    @Override
    public List<Adopter> findAllThatNeedApproval() {

        return adopterRepository.findAll().stream()
                .filter(a -> !a.getVerified() && a.getEmployeeVerificator() == null)
                .collect(Collectors.toList());
    }
}
