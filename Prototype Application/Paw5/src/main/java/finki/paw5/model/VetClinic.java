package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vet_clinic")
public class VetClinic {

    @Id
    @Column(name = "id_vet_clinic")
    private int id;

    @Column(name = "telephone_vet_clinic", nullable = false, length = 20)
    private String telephone;

    @Column(name = "address_vet_clinic", nullable = false, length = 100)
    private String address;

    @Column(name = "name_vet_clinic", nullable = false, length = 100)
    private String name;

    public VetClinic(String telephone, String address, String name) {
        this.telephone = telephone;
        this.address = address;
        this.name = name;
    }

    public VetClinic() {
    }
}
