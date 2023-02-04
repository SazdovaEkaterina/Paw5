package finki.paw5.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private int id;

    @Column(name = "name_category", nullable = false, length = 100)
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
}
