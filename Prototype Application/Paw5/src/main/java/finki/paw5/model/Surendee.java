package finki.paw5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "surendee")
@PrimaryKeyJoinColumn(name = "id_user")
public class Surendee extends User {

    public Surendee(LocalDate dateCreated, String name, String email, String password, String telephone) {
        super(dateCreated, name, email, password, telephone);
    }

    public Surendee() {
    }

}
