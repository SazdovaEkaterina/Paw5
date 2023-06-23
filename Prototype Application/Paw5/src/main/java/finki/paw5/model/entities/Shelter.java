package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "shelter", schema = "project")
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shelter")
    private Integer id;

    @Column(name = "address_shelter", nullable = false, length = 100)
    private String address;

    @Column(name = "telephone_shelter", nullable = false, length = 20)
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "id_organisation")
    private Organisation organisation;

    @Column(name = "name_shelter", nullable = false, length = 100)
    private String name;

    @Column(name = "email_shelter", nullable = false, length = 100, unique = true)
    private String email;

    public Shelter(String address, String telephone, Organisation organisation,
                   String name, String email) {
        this.address = address;
        this.telephone = telephone;
        this.organisation = organisation;
        this.name = name;
        this.email = email;
    }
}
