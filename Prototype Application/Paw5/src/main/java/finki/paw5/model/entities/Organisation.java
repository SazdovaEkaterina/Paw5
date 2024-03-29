package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "organisation", schema = "project")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_organisation")
    private Integer id;

    @Column(name = "name_organisation", nullable = false, length = 100)
    private String name;

    @Column(name = "email_organisation", nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "billing_information", nullable = false, length = 20, unique = true)
    private String billingInformation;

    @ManyToMany
    @JoinTable(name = "donor_donates_to_organisation",
            joinColumns = @JoinColumn(name = "id_organisation"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    List<Donor> donors;

    public Organisation(String name, String email, String billingInformation) {
        this.name = name;
        this.email = email;
        this.billingInformation = billingInformation;
    }
}
