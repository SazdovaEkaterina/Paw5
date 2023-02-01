package finki.paw5.model;

import finki.paw5.model.enumerations.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "personal_profile")
public class PersonalProfile {

    @Id
    @Column(name = "id_pet")
    private int id;

    @Column(name = "friendly_to_kids", nullable = false)
    private FriendlyToKids friendlyToKids;

    @Column(name = "friendly_to_pets", nullable = false)
    private FriendlyToPets friendlyToPets;

    @Column(name = "attention", nullable = false)
    private AttentionNeed attentionNeed;

    @Column(name = "physical_activity", nullable = false)
    private PhysicalActivity physicalActivity;

    @Column(name = "grooming_needed", nullable = false)
    private GroomingNeed groomingNeed;

    public PersonalProfile(int id, FriendlyToKids friendlyToKids, FriendlyToPets friendlyToPets, AttentionNeed attentionNeed, PhysicalActivity physicalActivity, GroomingNeed groomingNeed) {
        this.id = id;
        this.friendlyToKids = friendlyToKids;
        this.friendlyToPets = friendlyToPets;
        this.attentionNeed = attentionNeed;
        this.physicalActivity = physicalActivity;
        this.groomingNeed = groomingNeed;
    }

    public PersonalProfile() {
    }
}
