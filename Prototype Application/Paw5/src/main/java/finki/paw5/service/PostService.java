package finki.paw5.service;

import finki.paw5.model.entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    void save (Post post);

    List<Post> findAll();

    Optional<Post> findById(Integer id);
}
