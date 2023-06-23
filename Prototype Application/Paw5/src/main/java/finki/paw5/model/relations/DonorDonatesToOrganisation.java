package finki.paw5.model.relations;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "donor_donates_to_organisation", schema = "project")
@IdClass(DonorDonatesToOrganisationId.class)
public class DonorDonatesToOrganisation {

    @Id
    @Column(name="id_user", nullable = false)
    private Integer userId;

    @Id
    @Column(name="id_organisation", nullable = false)
    private Integer organisationId;

    public DonorDonatesToOrganisation(int userId, int organisationId) {
        this.userId = userId;
        this.organisationId = organisationId;
    }
}
