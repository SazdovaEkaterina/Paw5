package finki.paw5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "therapy")
public class Therapy {

    @Id
    @Column(name = "id_therapy")
    private int id;

    @Column(name = "health_problem", nullable = false, length = 100)
    private String healthProblem;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    public Therapy(String healthProblem, LocalDate startDate, LocalDate endDate) {
        this.healthProblem = healthProblem;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Therapy() {
    }
}
