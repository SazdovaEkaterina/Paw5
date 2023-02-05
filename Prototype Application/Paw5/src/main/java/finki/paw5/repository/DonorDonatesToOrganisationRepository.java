package finki.paw5.repository;

import finki.paw5.model.relations.DonorDonatesToOrganisation;
import finki.paw5.model.relations.DonorDonatesToOrganisationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorDonatesToOrganisationRepository extends JpaRepository<DonorDonatesToOrganisation, DonorDonatesToOrganisationId> {
}
