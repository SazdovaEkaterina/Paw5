package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "adoption", schema = "project")
public class Adoption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adoption")
    private Integer id;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date_foster")
    private LocalDate endDateFoster;

    @Column(name = "approved", nullable = false)
    private Boolean approved;

    @ManyToOne
    @JoinColumn(name = "id_adopter", nullable = false)
    private Adopter adopter;

    @OneToMany(mappedBy="adoption")
    private List<Pet> pets;

    public Adoption(LocalDate startDate, LocalDate endDateFoster, Boolean approved,
                    Adopter adopter) {
        this.startDate = startDate;
        this.endDateFoster = endDateFoster;
        this.approved = approved;
        this.adopter = adopter;
    }
}
