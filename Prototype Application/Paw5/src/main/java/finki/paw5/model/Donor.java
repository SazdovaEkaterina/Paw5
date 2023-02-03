package finki.paw5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "donor")
@PrimaryKeyJoinColumn(name = "id_user")
public class Donor extends User {

    @Column(name = "is_from_organisation", nullable = false)
    private boolean fromOrganisation;

    @Column(name = "name_organisation_donor", nullable = true, length = 100)
    private String organisationName;

    public Donor(LocalDate dateCreated, String name, String email, String password, String telephone, boolean fromOrganisation, String organisationName) {
        super(dateCreated, name, email, password, telephone);
        this.fromOrganisation = fromOrganisation;
        this.organisationName = organisationName;
    }

    public Donor(boolean fromOrganisation, String organisationName) {
        this.fromOrganisation = fromOrganisation;
        this.organisationName = organisationName;
    }

    public Donor() {
    }

}
