package finki.paw5.web.controllers;

import finki.paw5.model.entities.Employee;
import finki.paw5.model.entities.Pet;
import finki.paw5.model.entities.Post;
import finki.paw5.model.entities.User;
import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;
import finki.paw5.service.PetService;
import finki.paw5.service.PostService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class PostController {

    private final PostService postService;
    private final PetService petService;

    public PostController(PostService postService, PetService petService) {
        this.postService = postService;
        this.petService = petService;
    }

    @GetMapping("/create-post")
    public String get(Model model) {
        model.addAttribute("pets", this.petService.listpets());
        return "create-post";
    }

    @PostMapping("/submit-post")
    public String savePost(@RequestParam(required = false) Integer petId,
                           @RequestParam(required = false) boolean newPetCheckbox,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) String gender,
                           @RequestParam(required = false) String ageGroup,
                           @RequestParam(required = false) String size,
                           @RequestParam(required = false) String species,
                           @RequestParam(required = false) String breed,
                           @RequestParam(required = false) String imageUrl,
                           @RequestParam(required = false) boolean canBeFostered,
                           HttpServletRequest request) {

        Employee employee = (Employee) request.getSession().getAttribute("user");

        if(newPetCheckbox == true){

            Pet newPet = new Pet(imageUrl, AgeGroup.valueOf(ageGroup), Size.valueOf(size), breed, name, Species.valueOf(species), Gender.valueOf(gender), canBeFostered, null, employee.getShelterId());
            this.petService.save(newPet);

            Post post = new Post(LocalDate.now(), imageUrl, newPet.getId(), null, employee.getId());
            this.postService.save(post);

        } else{

            Pet selectedPet = this.petService.findById(petId);

            Post post = new Post(LocalDate.now(), imageUrl, selectedPet.getId(), null, employee.getId());
            this.postService.save(post);

        }

        return "redirect:/home";
    }
}
