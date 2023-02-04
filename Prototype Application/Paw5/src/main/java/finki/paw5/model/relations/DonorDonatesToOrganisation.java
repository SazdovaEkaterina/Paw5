package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "donor_donates_to_organisation")
@IdClass(DonorDonatesToOrganisationId.class)
public class DonorDonatesToOrganisation {

    @Id
    @Column(name="id_user", nullable = false)
    private int userId;

    @Id
    @Column(name="id_organisation", nullable = false)
    private int organisationId;

    public DonorDonatesToOrganisation(int userId, int organisationId) {
        this.userId = userId;
        this.organisationId = organisationId;
    }

    public DonorDonatesToOrganisation() {
        
    }
}
