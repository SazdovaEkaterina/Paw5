package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "donor")
@PrimaryKeyJoinColumn(name = "id_user")
public class Donor extends User {

    @Column(name = "is_from_organisation", nullable = false)
    private Boolean fromOrganisation;

    @Column(name = "name_organisation_donor", nullable = true, length = 100)
    private String organisationName;

    @ManyToMany
    @JoinTable(name = "donor_donates_to_organisation",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_organisation"))
    List<Organisation> donatedToOrganisations;

    public Donor(LocalDate dateCreated, String name, String email,
                 String password, String telephone, Boolean fromOrganisation,
                 String organisationName) {
        super(dateCreated, name, email, password, telephone);
        this.fromOrganisation = fromOrganisation;
        this.organisationName = organisationName;
    }

}
