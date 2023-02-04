package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pet_belongs_to_category")
@IdClass(PetBelongsToCategoryId.class)
public class PetBelongsToCategory {

    @Id
    @Column(name="id_pet", nullable = false)
    private int petId;

    @Id
    @Column(name="id_category", nullable = false)
    private int categoryId;

    public PetBelongsToCategory(int petId, int categoryId) {
        this.petId = petId;
        this.categoryId = categoryId;
    }

    public PetBelongsToCategory() {

    }
}
