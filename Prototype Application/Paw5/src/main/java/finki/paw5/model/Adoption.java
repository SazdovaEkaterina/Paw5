package finki.paw5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "adoption")
public class Adoption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adoption")
    private int id;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date_foster")
    private LocalDate endDateFoster;

    @Column(name = "approved", nullable = false)
    private boolean approved;

    @Column(name = "id_adopter", nullable = false)
    private int adopterId;

    public Adoption(LocalDate startDate, LocalDate endDateFoster, boolean approved, int adopterId) {
        this.startDate = startDate;
        this.endDateFoster = endDateFoster;
        this.approved = approved;
        this.adopterId = adopterId;
    }

    public Adoption() {
    }
}
