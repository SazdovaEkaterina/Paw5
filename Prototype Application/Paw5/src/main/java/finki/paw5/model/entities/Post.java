package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private Integer id;

    @Column(name="date_post", nullable = false)
    private LocalDate dateCreated;

    @Column(name="url_thumbanail", length = 200)
    private String thumbnailUrl;

    @Column(name="id_pet", nullable = false)
    private Integer petId;

    @Column(name="id_surendee")
    private Integer surendeeId;

    @Column(name="id_employee")
    private Integer employeeId;

    public Post(LocalDate dateCreated, String thumbnailUrl, Integer petId, Integer surendeeId, Integer employeeId) {
        this.dateCreated = dateCreated;
        this.thumbnailUrl = thumbnailUrl;
        this.petId = petId;
        this.surendeeId = surendeeId;
        this.employeeId = employeeId;
    }

    public Post() {
    }
}
