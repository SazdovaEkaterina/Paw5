package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "organisation")
public class Organisation {

    @Id
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
