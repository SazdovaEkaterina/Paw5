package finki.paw5.service;

import finki.paw5.model.entities.Post;
import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;

public interface PostService {

    Post submit (String pet_name, Gender gender, AgeGroup ageGroup, Size size, Species species, String breed, String urlimage);

}
