package finki.paw5.model.relations;

import lombok.Data;

import java.io.Serializable;

@Data
public class PetNeedsInterventionInVetClinicId implements Serializable {

    int petId;
    int vetClinicId;

}
