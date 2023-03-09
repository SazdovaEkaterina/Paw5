package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "admin_table")
@PrimaryKeyJoinColumn(name = "id_user")
public class Admin extends User {

    public Admin(LocalDate dateCreated, String name, String email,
                 String password, String telephone) {
        super(dateCreated, name, email, password, telephone);
    }
}
