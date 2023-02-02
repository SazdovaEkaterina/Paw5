package finki.paw5.model.relations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pet_preferably_eats_food")
public class PetPreferablyEatsFood {

    @Id
    @Column(name = "id_pet", nullable = false)
    private int petId;

    @Id
    @Column(name = "id_food", nullable = false)
    private int foodId;

    @Column(name = "quantity_a_day", nullable = false)
    private int quantityPerDay;

    public PetPreferablyEatsFood(int petId, int foodId, int quantityPerDay) {
        this.petId = petId;
        this.foodId = foodId;
        this.quantityPerDay = quantityPerDay;
    }

    public PetPreferablyEatsFood() {
    }
}
