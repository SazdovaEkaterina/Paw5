package finki.paw5.service;

import finki.paw5.model.entities.Pet;
import finki.paw5.web.controllers.PostController;

import java.util.List;
import java.util.Optional;

public interface PetService {

    void save (Pet pet);

    List<Pet> findAll();

    Optional<Pet> findById(Integer petId);
}
