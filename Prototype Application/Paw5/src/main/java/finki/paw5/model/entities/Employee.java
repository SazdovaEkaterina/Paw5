package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "employee", schema = "project")
@PrimaryKeyJoinColumn(name = "id_user")
public class Employee extends User {

    @Column(name = "position_employee", nullable = false, length = 20)
    private String position;

    @ManyToOne
    @JoinColumn(name = "id_shelter", nullable = false)
    private Shelter shelter;

    @Column(name = "is_verified", nullable = false)
    private Boolean verified;

    @ManyToOne
    @JoinColumn(name = "verified_by_admin")
    private Admin adminVerificator;

    public Employee(LocalDate dateCreated, String name, String email, String password, String telephone,
                    String position, Shelter shelter, Boolean verified) {
        super(dateCreated, name, email, password, telephone);
        this.position = position;
        this.shelter = shelter;
        this.verified = verified;
    }

}
