package finki.paw5.model.entities;

import finki.paw5.model.enumerations.FoodType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_food")
    private Integer id;

    @Column(name = "manufacturer", nullable = false, length = 100)
    private String manufacturer;

    @Column(name = "name_food", nullable = false, length = 20)
    private String name;

    @Column(name = "type_food", nullable = false)
    private FoodType type;

    @ManyToMany
    @JoinTable(name = "pet_preferably_eats_food",
            joinColumns = @JoinColumn(name = "id_food"),
            inverseJoinColumns = @JoinColumn(name = "id_pet"))
    List<Pet> pets;

    public Food(String manufacturer, String name, FoodType type) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.type = type;
    }
}
