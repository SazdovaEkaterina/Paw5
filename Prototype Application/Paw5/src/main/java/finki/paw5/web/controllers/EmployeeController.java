package finki.paw5.web.controllers;

import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Employee;
import finki.paw5.service.AdopterService;
import finki.paw5.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {

    private final AdopterService adopterService;
    private final EmployeeService employeeService;

    public EmployeeController(AdopterService adopterService, EmployeeService employeeService) {
        this.adopterService = adopterService;
        this.employeeService = employeeService;
    }

    @GetMapping("/approve-adopters")
    public String getApprovalPage(Model model){
        model.addAttribute("needApproval", this.adopterService.findAllThatNeedApproval());
        return "/approve-adopters";
    }

    @PostMapping("/submit-approval-{id}")
    public String approveAdopter(@PathVariable Integer id, HttpServletRequest request){

        Employee employeeVerificator = (Employee) request.getSession().getAttribute("user");

        Adopter adopter = this.adopterService.findById(id);

        adopter.setVerified(true);
        adopter.setEmployeeVerificator(employeeVerificator);

        this.adopterService.save(adopter);

        return "redirect:/approve-adopters";
    }
}
