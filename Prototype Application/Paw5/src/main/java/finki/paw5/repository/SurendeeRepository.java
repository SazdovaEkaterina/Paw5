package finki.paw5.repository;

import finki.paw5.model.entities.Surendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurendeeRepository extends JpaRepository<Surendee, Integer> {
}
