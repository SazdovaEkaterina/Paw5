package finki.paw5.model.entities;

import finki.paw5.model.enumerations.FreeTime;
import finki.paw5.model.enumerations.Funds;
import finki.paw5.model.enumerations.Housing;
import finki.paw5.model.enumerations.PhysicalActivity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "adopter", schema = "project")
@RequiredArgsConstructor
@PrimaryKeyJoinColumn(name = "id_user")
public class Adopter extends User {

    @Column(name = "free_time")
    private FreeTime freeTime;

    @Column(name = "funds")
    private Funds funds;

    @Column(name = "has_other_pets")
    private Boolean hasOtherPets;

    @Column(name = "has_kids")
    private Boolean hasKids;

    @Column(name = "housing")
    private Housing housing;

    @Column(name = "physical_activity_adopters")
    private PhysicalActivity physicalActivity;

    @Column(name = "will_foster")
    private Boolean willFoster;

    @Column(name = "is_verified", nullable = false)
    private Boolean verified;

    @ManyToOne
    @JoinColumn(name = "verified_by_employee")
    Employee employeeVerificator;

    public Adopter(LocalDate dateCreated, String name, String email, String password, String telephone,
                   FreeTime freeTime, Funds funds, boolean hasOtherPets, boolean hasKids, Housing housing,
                   PhysicalActivity physicalActivity, boolean willFoster, boolean verified) {
        super(dateCreated, name, email, password, telephone);
        this.freeTime = freeTime;
        this.funds = funds;
        this.hasOtherPets = hasOtherPets;
        this.hasKids = hasKids;
        this.housing = housing;
        this.physicalActivity = physicalActivity;
        this.willFoster = willFoster;
        this.verified = verified;
    }

}
