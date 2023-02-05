package finki.paw5.model.relations;

import lombok.Data;

import java.io.Serializable;

@Data
public class PetBelongsToCategoryId implements Serializable {

    Integer petId;
    Integer categoryId;

}
