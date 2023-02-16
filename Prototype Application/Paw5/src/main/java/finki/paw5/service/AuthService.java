package finki.paw5.service;

import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Employee;
import finki.paw5.model.entities.User;
import finki.paw5.model.enumerations.FreeTime;
import finki.paw5.model.enumerations.Funds;
import finki.paw5.model.enumerations.Housing;
import finki.paw5.model.enumerations.PhysicalActivity;

public interface AuthService {
    User login (String email, String password);
    Adopter registerAdopter(String name, String email, String password, String telephone, FreeTime freeTime, Funds funds, boolean hasOtherPets, boolean hasKids, Housing housing, PhysicalActivity physicalActivity, boolean willFoster);
    Employee registerEmployee(String name, String email, String password, String telephone, String position, Integer shelterId);

}
