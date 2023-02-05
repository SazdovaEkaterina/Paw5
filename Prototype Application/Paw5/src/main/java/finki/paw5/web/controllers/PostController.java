package finki.paw5.web.controllers;

import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;
import finki.paw5.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/CreatePost")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public String submit(@RequestParam String name,
                         @RequestParam Gender gender,
                         @RequestParam AgeGroup ageGroup,
                         @RequestParam Size size,
                         @RequestParam Species species,
                         @RequestParam String breed,
                         @RequestParam String urlimage) {

        this.postService.submit(name, gender, ageGroup, size, species, breed, urlimage);

        return null;
    }
}
