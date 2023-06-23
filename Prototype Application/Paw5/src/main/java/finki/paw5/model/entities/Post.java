package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "post", schema = "project")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private Integer id;

    @Column(name="date_post", nullable = false)
    private LocalDate dateCreated;

    @Column(name="url_thumbanail", length = 200)
    private String thumbnailUrl;

    @OneToOne
    @JoinColumn(name="id_pet", nullable = false)
    private Pet pet;

    @ManyToOne
    @JoinColumn(name="id_surendee")
    private Surendee surendeePoster;

    @ManyToOne
    @JoinColumn(name="id_employee")
    private Employee employeePoster;

    public Post(LocalDate dateCreated, String thumbnailUrl,
                Pet pet, Surendee surendeePoster, Employee employeePoster) {
        this.dateCreated = dateCreated;
        this.thumbnailUrl = thumbnailUrl;
        this.pet = pet;
        this.surendeePoster = surendeePoster;
        this.employeePoster = employeePoster;
    }
}
