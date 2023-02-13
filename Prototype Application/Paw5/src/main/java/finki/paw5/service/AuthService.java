package finki.paw5.service;

import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Employee;
import finki.paw5.model.entities.User;

import java.util.Optional;

public interface AuthService {
    User login (String email, String password);
//    Adopter registerAdopter(String password, String repeatPassword, String name, String email, String telephone);
//    Employee registerEmployee(String password, String repeatPassword, String name, String email, String telephone);

}
