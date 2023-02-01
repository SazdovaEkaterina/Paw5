package finki.paw5.model;

import finki.paw5.model.enumerations.FreeTime;
import finki.paw5.model.enumerations.Funds;
import finki.paw5.model.enumerations.Housing;
import finki.paw5.model.enumerations.PhysicalActivity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "adopter")
public class Adopter {

    @Id
    @Column(name = "id_user", nullable = false)
    private int id;

    @Column(name = "free_time")
    private FreeTime freeTime;

    @Column(name = "funds")
    private Funds funds;

    @Column(name = "has_other_pets")
    private boolean hasOtherPets;

    @Column(name = "has_kids")
    private boolean hasKids;

    @Column(name = "housing")
    private Housing housing;

    @Column(name = "physical_activity_adopters")
    private PhysicalActivity physicalActivity;

    @Column(name = "will_foster")
    private boolean willFoster;

    @Column(name = "is_verified", nullable = false)
    private boolean verified;

    @Column(name = "verified_by_employee")
    private int verifiedByEmployeeId;

    public Adopter(int id, FreeTime freeTime, Funds funds, boolean hasOtherPets, boolean hasKids, Housing housing, PhysicalActivity physicalActivity, boolean willFoster, boolean verified, int verifiedByEmployeeId) {
        this.id = id;
        this.freeTime = freeTime;
        this.funds = funds;
        this.hasOtherPets = hasOtherPets;
        this.hasKids = hasKids;
        this.housing = housing;
        this.physicalActivity = physicalActivity;
        this.willFoster = willFoster;
        this.verified = verified;
        this.verifiedByEmployeeId = verifiedByEmployeeId;
    }

    public Adopter() {
    }
}
