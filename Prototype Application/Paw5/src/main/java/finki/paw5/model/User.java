package finki.paw5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "user_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    protected int id;

    @Column(name = "date_created_user", nullable = false)
    protected LocalDate dateCreated;

    @Column(name = "name_user", nullable = false, length = 100)
    protected String name;

    @Column(name = "email_user", nullable = false, length = 100, unique = true)
    protected String email;

    @Column(name = "password_user", nullable = false, length = 20)
    protected String password;

    @Column(name = "telephone_user", length = 20)
    protected String telephone;

    public User(LocalDate dateCreated, String name, String email, String password, String telephone) {
        this.dateCreated = dateCreated;
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }

    public User() {
    }
}
