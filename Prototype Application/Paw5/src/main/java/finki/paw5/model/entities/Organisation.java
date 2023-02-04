package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "organisation")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_organisation")
    private int id;

    @Column(name = "name_organisation", nullable = false, length = 100)
    private String name;

    @Column(name = "email_organisation", nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "billing_information", nullable = false, length = 20, unique = true)
    private String billingInformation;

    public Organisation(String name, String email, String billingInformation) {
        this.name = name;
        this.email = email;
        this.billingInformation = billingInformation;
    }

    public Organisation() {
    }
}
