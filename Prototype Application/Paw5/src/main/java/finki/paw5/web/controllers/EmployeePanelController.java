package finki.paw5.web.controllers;

import finki.paw5.service.AdopterService;
import finki.paw5.service.AdoptionService;
import finki.paw5.service.EmployeeService;
import finki.paw5.service.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeePanelController {

    private final EmployeeService employeeService;
    private final AdopterService adopterService;
    private final AdoptionService adoptionService;
    private final PetService petService;

    public EmployeePanelController(EmployeeService employeeService,
                                   AdopterService adopterService,
                                   AdoptionService adoptionService,
                                   PetService petService) {
        this.employeeService = employeeService;
        this.adopterService = adopterService;
        this.adoptionService = adoptionService;
        this.petService = petService;
    }
}
