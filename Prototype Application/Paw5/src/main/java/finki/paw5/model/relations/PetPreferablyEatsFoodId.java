package finki.paw5.model.relations;

import lombok.Data;

import java.io.Serializable;

@Data
public class PetPreferablyEatsFoodId implements Serializable {

    private int petId;
    private int foodId;

}
