package finki.paw5.repository;

import finki.paw5.model.relations.PetBelongsToCategory;
import finki.paw5.model.relations.PetBelongsToCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetBelongsToCategoryRepository extends JpaRepository<PetBelongsToCategory, PetBelongsToCategoryId> {
}
