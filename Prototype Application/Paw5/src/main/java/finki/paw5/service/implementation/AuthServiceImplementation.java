package finki.paw5.service.implementation;

import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Employee;
import finki.paw5.model.entities.User;
import finki.paw5.model.enumerations.FreeTime;
import finki.paw5.model.enumerations.Funds;
import finki.paw5.model.enumerations.Housing;
import finki.paw5.model.enumerations.PhysicalActivity;
import finki.paw5.repository.AdopterRepository;
import finki.paw5.repository.EmployeeRepository;
import finki.paw5.repository.UserRepository;
import finki.paw5.service.AuthService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AuthServiceImplementation implements AuthService {

    private final UserRepository userRepository;
    private final AdopterRepository adopterRepository;
    private final EmployeeRepository employeeRepository;

    public AuthServiceImplementation(UserRepository userRepository, AdopterRepository adopterRepository, EmployeeRepository employeeRepository) {
        this.userRepository = userRepository;
        this.adopterRepository = adopterRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public User login(String email, String password) {

        if(userRepository.findByEmailAndPassword(email, password)!=null){
            return userRepository.findByEmailAndPassword(email,password);
        }
        return null;
    }


    @Override
    public Adopter registerAdopter(String name, String email, String password, String telephone, FreeTime freeTime, Funds funds, boolean hasOtherPets, boolean hasKids, Housing housing, PhysicalActivity physicalActivity, boolean willFoster) {
        Adopter adopter = new Adopter(LocalDate.now(), name, email, password, telephone,freeTime,funds,hasOtherPets,hasKids,housing,physicalActivity,willFoster,false);
        return adopterRepository.save(adopter);
    }

    @Override
    public Employee registerEmployee(String name, String email, String password, String telephone, String position, Integer shelterId) {
        Employee employee = new Employee(LocalDate.now(),name, email,password,telephone,position,shelterId,false);
        return employeeRepository.save(employee);
    }

}
