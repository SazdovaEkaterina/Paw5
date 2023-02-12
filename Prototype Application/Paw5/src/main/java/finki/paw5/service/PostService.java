package finki.paw5.service;

import finki.paw5.model.entities.Post;
import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;

public interface PostService {

    void save (Post post);

}
