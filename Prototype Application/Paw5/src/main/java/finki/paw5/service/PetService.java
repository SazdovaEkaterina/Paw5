package finki.paw5.service;

import finki.paw5.model.entities.Pet;

import java.util.List;

public interface PetService {

    void save (Pet pet);

    List<Pet> listpets();
}