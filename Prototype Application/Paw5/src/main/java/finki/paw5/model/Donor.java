package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "donor")
public class Donor {

    @Id
    @Column(name = "id_user", nullable = false)
    private int id;

    @Column(name = "is_from_organisation", nullable = false)
    private boolean fromOrganisation;

    @Column(name = "name_organisation_donor", nullable = true, length = 100)
    private String organisationName;

    public Donor(int id, boolean fromOrganisation, String organisationName) {
        this.id = id;
        this.fromOrganisation = fromOrganisation;
        this.organisationName = organisationName;
    }

    public Donor() {
    }
}
