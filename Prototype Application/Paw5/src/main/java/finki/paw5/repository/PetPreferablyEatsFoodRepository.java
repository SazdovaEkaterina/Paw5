package finki.paw5.repository;

import finki.paw5.model.relations.PetPreferablyEatsFood;
import finki.paw5.model.relations.PetPreferablyEatsFoodId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetPreferablyEatsFoodRepository extends JpaRepository<PetPreferablyEatsFood, PetPreferablyEatsFoodId> {
}
