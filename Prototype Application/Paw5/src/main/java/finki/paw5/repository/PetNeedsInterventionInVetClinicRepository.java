package finki.paw5.repository;

import finki.paw5.model.relations.PetNeedsInterventionInVetClinic;
import finki.paw5.model.relations.PetNeedsInterventionInVetClinicId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetNeedsInterventionInVetClinicRepository extends JpaRepository<PetNeedsInterventionInVetClinic, PetNeedsInterventionInVetClinicId> {
}
