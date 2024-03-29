package finki.paw5.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "therapy", schema = "project")
public class Therapy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_therapy")
    private Integer id;

    @Column(name = "health_problem", nullable = false, length = 100)
    private String healthProblem;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToMany
    @JoinTable(name = "pet_needs_therapy",
            joinColumns = @JoinColumn(name = "id_therapy"),
            inverseJoinColumns = @JoinColumn(name = "id_pet"))
    List<Pet> pets;

    public Therapy(String healthProblem, LocalDate startDate, LocalDate endDate) {
        this.healthProblem = healthProblem;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
