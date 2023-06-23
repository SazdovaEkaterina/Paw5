package finki.paw5.model.entities;

import finki.paw5.model.enumerations.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "personal_profile", schema = "project")
public class PersonalProfile {

    @Id
    @Column(name = "id_pet", nullable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_pet", nullable = false)
    private Pet pet;

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

    public PersonalProfile(Integer id, Pet pet, FriendlyToKids friendlyToKids, FriendlyToPets friendlyToPets, AttentionNeed attentionNeed, PhysicalActivity physicalActivity, GroomingNeed groomingNeed) {
        this.id = id;
        this.pet = pet;
        this.friendlyToKids = friendlyToKids;
        this.friendlyToPets = friendlyToPets;
        this.attentionNeed = attentionNeed;
        this.physicalActivity = physicalActivity;
        this.groomingNeed = groomingNeed;
    }
}
