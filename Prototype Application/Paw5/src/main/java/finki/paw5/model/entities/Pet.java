package finki.paw5.model.entities;

import finki.paw5.model.enumerations.AgeGroup;
import finki.paw5.model.enumerations.Gender;
import finki.paw5.model.enumerations.Size;
import finki.paw5.model.enumerations.Species;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_pet", nullable = false)
    private PersonalProfile personalProfile;

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
    private Boolean canBeFostered;

    @ManyToOne
    @JoinColumn(name = "id_adoption")
    private Adoption adoption;

    @ManyToOne
    @JoinColumn(name = "id_shelter")
    private Shelter shelter;

    @ManyToMany
    @JoinTable(name = "pet_belongs_to_category",
            joinColumns = @JoinColumn(name = "id_pet"),
            inverseJoinColumns = @JoinColumn(name = "id_category"))
    List<Category> categories;

    @ManyToMany
    @JoinTable(name = "pet_needs_intervention_in_vet_clinic",
            joinColumns = @JoinColumn(name = "id_pet"),
            inverseJoinColumns = @JoinColumn(name = "id_vet_clinic"))
    List<VetClinic> vetClinicsTreatedIn;

    @ManyToMany
    @JoinTable(name = "pet_needs_therapy",
            joinColumns = @JoinColumn(name = "id_pet"),
            inverseJoinColumns = @JoinColumn(name = "id_therapy"))
    List<Therapy> therapies;

    @ManyToMany
    @JoinTable(name = "pet_preferably_eats_food",
            joinColumns = @JoinColumn(name = "id_pet"),
            inverseJoinColumns = @JoinColumn(name = "id_food"))
    List<Food> preferredFoods;

    public Pet(String imageUrl, AgeGroup ageGroup, Size size, String breed,
               String name, Species species, Gender gender, Boolean canBeFostered,
               Adoption adoption, Shelter shelter) {
        this.imageUrl = imageUrl;
        this.ageGroup = ageGroup;
        this.size = size;
        this.breed = breed;
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.canBeFostered = canBeFostered;
        this.adoption = adoption;
        this.shelter = shelter;
    }
}
