package finki.paw5.web.controllers;

import finki.paw5.service.PostService;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

}