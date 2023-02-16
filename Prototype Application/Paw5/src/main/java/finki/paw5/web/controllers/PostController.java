package finki.paw5.web.controllers;

import finki.paw5.model.entities.PersonalProfile;
import finki.paw5.model.entities.Pet;
import finki.paw5.model.entities.Post;
import finki.paw5.model.entities.Shelter;
import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;
import finki.paw5.service.PersonalProfileService;
import finki.paw5.service.PetService;
import finki.paw5.service.PostService;
import finki.paw5.service.ShelterService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class PostController {

    private final PostService postService;
    private final PetService petService;
    private final PersonalProfileService personalProfileService;

    public PostController(PostService postService, PetService petService, PersonalProfileService personalProfileService, ShelterService shelterService) {
        this.postService = postService;
        this.petService = petService;
        this.personalProfileService = personalProfileService;
    }

    @GetMapping("create-post")
    public String get(Model model) {
        //TODO: vakvo ama za lista so pets
        //        List<Manufacturer> manufacturers = this.manufacturerService.findAll();
        //        model.addAttribute("manufacturers", manufacturers);
        return "create-post";
    }

    @PostMapping("submit-post")
    public String savePost(@RequestParam(required = false) String name,
                           @RequestParam String gender,
                           @RequestParam String ageGroup,
                           @RequestParam String size,
                           @RequestParam String species,
                           @RequestParam(required = false) String breed,
                           @RequestParam(required = false) String imageUrl,
                           @RequestParam(required = false) boolean canBeFostered) {

        Pet pet = new Pet(imageUrl, AgeGroup.valueOf(ageGroup), Size.valueOf(size), breed, name, Species.valueOf(species), Gender.valueOf(gender), canBeFostered, null, 1);
        this.petService.save(pet);

        Post post = new Post(LocalDate.now(), imageUrl, pet.getId(), null, 10);//TODO: employee id da se zeme preku session user getid
        this.postService.save(post);

        return "redirect:/home";
    }

    @GetMapping("/adoption-posts")
    public String getAdoptionPosts(Model model, HttpServletRequest request){

        List<Post> posts = this.postService.findAll();
        List<Pet> pets = this.petService.findAll();
        //model.addAttribute("posts", posts);
        //model.addAttribute("pets",pets);
        request.getSession().setAttribute("posts",posts);//temp
        request.getSession().setAttribute("pets",pets);//temp

        return "list-posts-adoption";
    }

    @GetMapping("/pet-details-{id}")
    public String getPostDetails(@PathVariable Integer id, Model model, HttpServletRequest request){

        Post post = this.postService.findById(id).get();
        Pet pet = this.petService.findById(post.getPetId()).get();

        //model.addAttribute("pet", pet);
        //model.addAttribute("post", post);
        request.getSession().setAttribute("post", post);//temp
        request.getSession().setAttribute("pet", pet);//temp

        if(pet.getAdoptionId() != null){
            request.getSession().setAttribute("disableAdoption", true);
        } else{
            request.getSession().setAttribute("disableAdoption", false);
        }

        return "pet-details";
    }
}
