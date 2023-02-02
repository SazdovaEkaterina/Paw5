package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "user_table")
public class User {

    @Id
    @Column(name = "id_user")
    private int id;

    @Column(name = "date_created_user", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "name_user", nullable = false, length = 100)
    private String name;

    @Column(name = "email_user", nullable = false, length = 100, unique=true)
    private String email;

    @Column(name = "password_user", nullable = false, length = 20)
    private String password;

    @Column(name = "telephone_user", length = 20)
    private String telephone;

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
