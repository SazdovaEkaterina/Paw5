package finki.paw5.service.implementation;

import finki.paw5.model.entities.Employee;
import finki.paw5.repository.EmployeeRepository;
import finki.paw5.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
