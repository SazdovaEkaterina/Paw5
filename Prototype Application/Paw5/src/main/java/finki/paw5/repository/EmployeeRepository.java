package finki.paw5.repository;

import finki.paw5.model.entities.Employee;
import finki.paw5.model.entities.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
