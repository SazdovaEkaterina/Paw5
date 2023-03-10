package finki.paw5.service;


import finki.paw5.model.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
