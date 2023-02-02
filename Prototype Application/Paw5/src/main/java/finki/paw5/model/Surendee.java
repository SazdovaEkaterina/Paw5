package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "surendee")
public class Surendee {

    @Id
    @Column(name = "id_user", nullable = false)
    private int id;

    public Surendee(int id) {
        this.id = id;
    }

    public Surendee() {
    }
}
