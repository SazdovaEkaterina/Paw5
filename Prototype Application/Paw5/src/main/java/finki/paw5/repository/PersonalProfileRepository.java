package finki.paw5.repository;

import finki.paw5.model.entities.PersonalProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalProfileRepository extends JpaRepository<PersonalProfile, Integer> {
}
