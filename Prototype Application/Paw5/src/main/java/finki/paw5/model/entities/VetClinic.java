package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "vet_clinic", schema = "project")
public class VetClinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vet_clinic")
    private Integer id;

    @Column(name = "telephone_vet_clinic", nullable = false, length = 20)
    private String telephone;

    @Column(name = "address_vet_clinic", nullable = false, length = 100)
    private String address;

    @Column(name = "name_vet_clinic", nullable = false, length = 100)
    private String name;

    @ManyToMany
    @JoinTable(name = "pet_needs_intervention_in_vet_clinic",
            joinColumns = @JoinColumn(name = "id_vet_clinic"),
            inverseJoinColumns = @JoinColumn(name = "id_pet"))
    List<Pet> pets;

    public VetClinic(String telephone, String address, String name) {
        this.telephone = telephone;
        this.address = address;
        this.name = name;
    }
}
