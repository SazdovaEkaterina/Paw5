package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "surendee", schema = "project")
@PrimaryKeyJoinColumn(name = "id_user")
public class Surendee extends User {

    public Surendee(LocalDate dateCreated, String name, String email, String password, String telephone) {
        super(dateCreated, name, email, password, telephone);
    }

}
