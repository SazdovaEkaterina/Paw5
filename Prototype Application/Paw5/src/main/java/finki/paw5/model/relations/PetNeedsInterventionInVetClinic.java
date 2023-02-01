package finki.paw5.model.relations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "pet_needs_intervention_in_vet_clinic")
public class PetNeedsInterventionInVetClinic {

    @Id
    @Column(name = "id_pet", nullable = false)
    private int petId;

    @Id
    @Column(name = "id_vet_clinic", nullable = false)
    private int vetClinicId;

    @Column(name = "date_of_interventing", nullable = false)
    private Date interventionDate;

    @Column(name = "description", length = 100)
    private String description;

    public PetNeedsInterventionInVetClinic(int petId, int vetClinicId, Date interventionDate, String description) {
        this.petId = petId;
        this.vetClinicId = vetClinicId;
        this.interventionDate = interventionDate;
        this.description = description;
    }

    public PetNeedsInterventionInVetClinic() {

    }
}
