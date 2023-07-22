package finki.paw5.service;

import finki.paw5.model.entities.Adoption;
import finki.paw5.model.entities.Pet;

import java.util.List;

public interface AdoptionService {

    void save(Adoption adoption);

    Adoption findById(Integer id);

    List<Adoption> findAll();

    List<Adoption> findAllThatNeedApproval();

    Adoption markApproved(Integer id);
}
