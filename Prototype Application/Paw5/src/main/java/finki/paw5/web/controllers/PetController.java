package finki.paw5.web.controllers;

import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Adoption;
import finki.paw5.model.entities.Pet;
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

    @PostMapping("/submit-adoption-{id}")
    public String saveAdoption(@PathVariable Integer id, HttpServletRequest request) {

        Pet pet = this.petService.findById(id);
        
        Adopter adopter = (Adopter) request.getSession().getAttribute("user");

        Adoption adoption = new Adoption(LocalDate.now(), null, false, adopter);
        this.adoptionService.save(adoption);

        pet.setAdoption(adoption);
        this.petService.save(pet);

        return "redirect:/home";
    }
}
