package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "pet_preferably_eats_food", schema = "project")
@IdClass(PetPreferablyEatsFoodId.class)
public class PetPreferablyEatsFood {

    @Id
    @Column(name = "id_pet", nullable = false)
    private Integer petId;

    @Id
    @Column(name = "id_food", nullable = false)
    private Integer foodId;

    @Column(name = "quantity_a_day", nullable = false)
    private int quantityPerDay;

    public PetPreferablyEatsFood(int petId, int foodId, int quantityPerDay) {
        this.petId = petId;
        this.foodId = foodId;
        this.quantityPerDay = quantityPerDay;
    }
}
