package finki.paw5.web.controllers;

import finki.paw5.model.entities.Adoption;
import finki.paw5.model.entities.Pet;
import finki.paw5.model.entities.User;
import finki.paw5.model.exceptions.InvalidPetIdException;
import finki.paw5.service.AdoptionService;
import finki.paw5.service.PetService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class PetController {

    private final PetService petService;
    private final AdoptionService adoptionService;

    public PetController(PetService petService, AdoptionService adoptionService) {
        this.petService = petService;
        this.adoptionService = adoptionService;
    }

    @PostMapping("/submit-adopton-{id}")
    public String saveAdoption(@PathVariable Integer id, HttpServletRequest request) {

        Pet pet = this.petService.findById(id).orElseThrow(InvalidPetIdException::new);
        
        User user = (User) request.getSession().getAttribute("user");

        Adoption adoption = new Adoption(LocalDate.now(), null, false, user.getId());
        this.adoptionService.save(adoption);

        pet.setAdoptionId(adoption.getId());
        this.petService.save(pet);

        return "redirect:/home";
    }
}
