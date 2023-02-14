package finki.paw5.service.implementation;

import finki.paw5.model.entities.Post;
import finki.paw5.repository.PostRepository;
import finki.paw5.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService {

    private final PostRepository postRepository;

    public PostServiceImplementation(PostRepository PostRepository){
        this.postRepository = PostRepository;
    }

    @Override
    public void save(Post post) {
        this.postRepository.save(post);
    }

    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(Integer id) {
        return this.postRepository.findById(id);
    }
}
