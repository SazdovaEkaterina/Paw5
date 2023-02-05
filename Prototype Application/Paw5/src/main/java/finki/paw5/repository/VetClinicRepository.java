package finki.paw5.repository;

import finki.paw5.model.entities.VetClinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetClinicRepository extends JpaRepository<VetClinic, Integer> {
}
