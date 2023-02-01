package finki.paw5.model;

import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @Column(name = "id_pet", nullable = false)
    private int id;

    @Column(name = "url_pet_image", length = 200)
    private String imageUrl;

    @Column(name = "age_group", nullable = false)
    private AgeGroup ageGroup;

    @Column(name = "size_pet", nullable = false)
    private Size size;

    @Column(name = "breed", length = 100)
    private String breed;

    @Column(name = "name_pet", length = 20)
    private String name;

    @Column(name = "species", nullable = false)
    private Species species;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "can_be_fostered", nullable = false)
    private boolean canBeFostered;

    @Column(name = "id_adoption")
    private int adoptionId;

    @Column(name = "id_shelter")
    private int shelterId;

    public Pet(String imageUrl, AgeGroup ageGroup, Size size, String breed, String name, Species species, Gender gender, boolean canBeFostered, int adoptionId, int shelterId) {
        this.imageUrl = imageUrl;
        this.ageGroup = ageGroup;
        this.size = size;
        this.breed = breed;
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.canBeFostered = canBeFostered;
        this.adoptionId = adoptionId;
        this.shelterId = shelterId;
    }

    public Pet() {
    }
}
