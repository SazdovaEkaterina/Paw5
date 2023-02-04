package finki.paw5.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "shelter")
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shelter")
    private int id;

    @Column(name = "address_shelter", nullable = false, length = 100)
    private String address;

    @Column(name = "telephone_shelter", nullable = false, length = 20)
    private String telephone;

    @Column(name = "id_organisation")
    private int organisationId;

    @Column(name = "name_shelter", nullable = false, length = 100)
    private String name;

    @Column(name = "email_shelter", nullable = false, length = 100, unique = true)
    private String email;

    public Shelter(String address, String telephone, int organisationId, String name, String email) {
        this.address = address;
        this.telephone = telephone;
        this.organisationId = organisationId;
        this.name = name;
        this.email = email;
    }

    public Shelter() {
    }
}
