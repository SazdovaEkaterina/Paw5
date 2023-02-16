package finki.paw5.service.implementation;

import finki.paw5.model.entities.Organisation;
import finki.paw5.repository.OrganisationRepository;
import finki.paw5.service.OrganisationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganisationServiceImplementation implements OrganisationService {
    private final OrganisationRepository organisationRepository;

    public OrganisationServiceImplementation(OrganisationRepository organisationRepository) {
        this.organisationRepository = organisationRepository;
    }

    @Override
    public List<Organisation> findAll() {
        return organisationRepository.findAll();
    }
}
