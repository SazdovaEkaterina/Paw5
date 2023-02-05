package finki.paw5.service.implementation;

import finki.paw5.model.Post;
import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;
import finki.paw5.service.PostService;

public class PostServiceImpl implements PostService {
    private final finki.paw5.repository.PostRepository PostRepository;

    public PostServiceImpl(finki.paw5.repository.PostRepository PostRepository){
        this.PostRepository = PostRepository;
    }


    @Override
    public Post submit(String name, Gender gender, AgeGroup ageGroup, Size size, Species species, String breed, String urlimage) {
        Post post = new Post(name, gender, ageGroup, size, species, breed, urlimage);
        return null;
    }
}
