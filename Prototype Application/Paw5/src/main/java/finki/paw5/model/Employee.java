package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id_user", nullable = false)
    private int id;

    @Column(name = "position_employee", nullable = false, length = 20)
    private String position;

    @Column(name = "id_shelter", nullable = false)
    private int shelterId;

    @Column(name = "is_verified", nullable = false)
    private boolean verified;

    @Column(name = "verified_by_admin")
    private int verifiedByAdminId;

    public Employee() {

    }

    public Employee(int id, String position, int shelterId, boolean verified, int verifiedByAdminId) {
        this.id = id;
        this.position = position;
        this.shelterId = shelterId;
        this.verified = verified;
        this.verifiedByAdminId = verifiedByAdminId;
    }

}
