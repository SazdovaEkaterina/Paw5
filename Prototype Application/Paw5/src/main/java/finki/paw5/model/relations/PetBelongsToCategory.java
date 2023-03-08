package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "pet_belongs_to_category")
@IdClass(PetBelongsToCategoryId.class)
public class PetBelongsToCategory {

    @Id
    @Column(name="id_pet", nullable = false)
    private Integer petId;

    @Id
    @Column(name="id_category", nullable = false)
    private Integer categoryId;

    public PetBelongsToCategory(int petId, int categoryId) {
        this.petId = petId;
        this.categoryId = categoryId;
    }
}
