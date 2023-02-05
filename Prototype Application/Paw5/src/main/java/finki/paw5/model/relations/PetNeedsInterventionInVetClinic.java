package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "pet_needs_intervention_in_vet_clinic")
@IdClass(PetNeedsInterventionInVetClinicId.class)
public class PetNeedsInterventionInVetClinic {

    @Id
    @Column(name = "id_pet", nullable = false)
    private Integer petId;

    @Id
    @Column(name = "id_vet_clinic", nullable = false)
    private Integer vetClinicId;

    @Column(name = "date_of_interventing", nullable = false)
    private LocalDate interventionDate;

    @Column(name = "description", length = 100)
    private String description;

    public PetNeedsInterventionInVetClinic(int petId, int vetClinicId, LocalDate interventionDate, String description) {
        this.petId = petId;
        this.vetClinicId = vetClinicId;
        this.interventionDate = interventionDate;
        this.description = description;
    }

    public PetNeedsInterventionInVetClinic() {

    }
}
