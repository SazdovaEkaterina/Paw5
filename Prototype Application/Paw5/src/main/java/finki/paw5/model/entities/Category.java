package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer id;

    @Column(name = "name_category", nullable = false, length = 100)
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
}
