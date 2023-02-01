package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @Column(name = "id_post")
    private int id;

    @Column(name="date_post", nullable = false)
    private Date dateCreated;

    @Column(name="url_thumbanail", length = 200)
    private String thumbnailUrl;

    @Column(name="id_pet", nullable = false)
    private int petId;

    @Column(name="id_surendee")
    private int surendeeId;

    @Column(name="id_employee")
    private int employeeId;

    public Post(Date dateCreated, String thumbnailUrl, int petId, int surendeeId, int employeeId) {
        this.dateCreated = dateCreated;
        this.thumbnailUrl = thumbnailUrl;
        this.petId = petId;
        this.surendeeId = surendeeId;
        this.employeeId = employeeId;
    }

    public Post() {
    }
}