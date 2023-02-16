package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "employee")
@PrimaryKeyJoinColumn(name = "id_user")
public class Employee extends User {

    @Column(name = "position_employee", nullable = false, length = 20)
    private String position;

    @Column(name = "id_shelter", nullable = false)
    private Integer shelterId;

    @Column(name = "is_verified", nullable = false)
    private boolean verified;

    @Column(name = "verified_by_admin")
    private Integer verifiedByAdminId;

    public Employee(LocalDate dateCreated, String name, String email, String password, String telephone,
                    String position, int shelterId, boolean verified) {
        super(dateCreated, name, email, password, telephone);
        this.position = position;
        this.shelterId = shelterId;
        this.verified = verified;
    }

    public Employee(String position, int shelterId, boolean verified, int verifiedByAdminId) {
        this.position = position;
        this.shelterId = shelterId;
        this.verified = verified;
        this.verifiedByAdminId = verifiedByAdminId;
    }

    public Employee() {

    }

}
