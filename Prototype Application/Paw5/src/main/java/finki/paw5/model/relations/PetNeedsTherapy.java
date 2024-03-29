package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "pet_needs_therapy", schema = "project")
@IdClass(PetNeedsTherapyId.class)
public class PetNeedsTherapy {

    @Id
    @Column(name="id_pet", nullable = false)
    private Integer petId;

    @Id
    @Column(name="id_therapy", nullable = false)
    private Integer therapyId;

    public PetNeedsTherapy(int petId, int therapyId) {
        this.petId = petId;
        this.therapyId = therapyId;
    }
}
