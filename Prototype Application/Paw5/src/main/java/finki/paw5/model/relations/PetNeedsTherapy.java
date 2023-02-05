package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pet_needs_therapy")
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

    public PetNeedsTherapy() {
    }
}
