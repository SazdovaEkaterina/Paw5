package finki.paw5.repository;

import org.springframework.stereotype.Repository;

import finki.paw5.model.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
