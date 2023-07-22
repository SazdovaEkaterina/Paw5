package finki.paw5.web.controllers;

import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Adoption;
import finki.paw5.service.AdopterService;
import finki.paw5.service.AdoptionService;
import finki.paw5.service.EmployeeService;
import finki.paw5.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee-panel")
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

    @GetMapping
    public String getEmployeePanel(){
        return "employee-panel/employee-panel";
    }

    @GetMapping("/adoptions-for-approval")
    public String getAdoptionsForApproval(Model model){

        List<Adoption> adoptionsForApproval
                = this.adoptionService.findAllThatNeedApproval();
        model.addAttribute(
                "adoptionsForApproval",
                adoptionsForApproval);

        return "employee-panel/adoptions-for-approval";
    }

    @GetMapping("/adoptions-for-approval/{id}")
    public String getAdoptionForApprovalDetails(
            @PathVariable Integer id,
            Model model){

        Adoption adoptionForApproval
                = this.adoptionService.findById(id);
        model.addAttribute(
                "adoptionForApproval",
                adoptionForApproval);

        return "employee-panel/adoption-details";
    }

    @GetMapping("/adopters-for-approval")
    public String getAdoptersForApproval(Model model){

        List<Adopter> adoptersForApproval
                = this.adopterService.findAllThatNeedApproval();
        model.addAttribute(
                "adoptersForApproval",
                adoptersForApproval);

        return "employee-panel/adopters-for-approval";
    }
}
