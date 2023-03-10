package finki.paw5.service;

import finki.paw5.model.entities.Adopter;

import java.util.List;

public interface AdopterService {
    List<Adopter> findAllThatNeedApproval();

    Adopter findById(Integer id);

    void save(Adopter adopter);
}
