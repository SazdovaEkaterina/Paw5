package finki.paw5.service;

import finki.paw5.model.entities.Shelter;

import java.util.List;
import java.util.Optional;

public interface ShelterService {
    Optional<Shelter> findById(Integer id);
    List<Shelter> listShelters();
}
