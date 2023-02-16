package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "adoption")
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
    private boolean approved;

    @Column(name = "id_adopter", nullable = false)
    private Integer adopterId;

    public Adoption(LocalDate startDate, LocalDate endDateFoster, boolean approved, Integer adopterId) {
        this.startDate = startDate;
        this.endDateFoster = endDateFoster;
        this.approved = approved;
        this.adopterId = adopterId;
    }

    public Adoption() {
    }
}
