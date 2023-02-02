package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "adoption")
public class Adoption {

    @Id
    @Column(name = "id_adoption")
    private int id;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date_foster")
    private Date endDateFoster;

    @Column(name = "approved", nullable = false)
    private boolean approved;

    @Column(name = "id_adopter", nullable = false)
    private int adopterId;

    public Adoption(Date startDate, Date endDateFoster, boolean approved, int adopterId) {
        this.startDate = startDate;
        this.endDateFoster = endDateFoster;
        this.approved = approved;
        this.adopterId = adopterId;
    }

    public Adoption() {
    }
}
