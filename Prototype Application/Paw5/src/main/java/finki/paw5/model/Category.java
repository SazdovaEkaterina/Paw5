package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
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
