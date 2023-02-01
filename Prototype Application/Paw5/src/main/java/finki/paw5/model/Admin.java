package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "admin_table")
public class Admin {

    @Id
    @Column(name = "id_user", nullable = false)
    private int id;

    public Admin(int id) {
        this.id = id;
    }

    public Admin() {
    }
}
