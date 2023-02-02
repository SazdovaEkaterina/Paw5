package finki.paw5.model.relations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pet_belongs_to_category")
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
