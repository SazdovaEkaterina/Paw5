package finki.paw5.service.implementation;

import finki.paw5.repository.PostRepository;
import finki.paw5.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImplementation implements PostService {

    private final PostRepository postRepository;

    public PostServiceImplementation(PostRepository PostRepository){
        this.postRepository = PostRepository;
    }

}