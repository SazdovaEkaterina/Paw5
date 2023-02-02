package finki.paw5.model;

import finki.paw5.model.enumerations.FoodType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "food")
public class Food {

    @Id
    @Column(name = "id_food")
    private int id;

    @Column(name = "manufacturer", nullable = false, length = 100)
    private String manufacturer;

    @Column(name = "name_food", nullable = false, length = 20)
    private String name;

    @Column(name = "type_food", nullable = false)
    private FoodType type;

    public Food(String manufacturer, String name, FoodType type) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.type = type;
    }

    public Food() {
    }
}
