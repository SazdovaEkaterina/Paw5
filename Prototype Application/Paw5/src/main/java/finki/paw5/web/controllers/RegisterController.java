package finki.paw5.web.controllers;
import finki.paw5.model.entities.Adopter;
import finki.paw5.model.entities.Employee;
import finki.paw5.model.enumerations.FreeTime;
import finki.paw5.model.enumerations.Funds;
import finki.paw5.model.enumerations.Housing;
import finki.paw5.model.enumerations.PhysicalActivity;
import finki.paw5.service.AuthService;
import finki.paw5.service.OrganisationService;
import finki.paw5.service.ShelterService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final OrganisationService organisationService;
    private final ShelterService shelterService;
    private final AuthService authService;

    public RegisterController(OrganisationService organisationService, ShelterService shelterService, AuthService authService) {
        this.organisationService = organisationService;
        this.shelterService = shelterService;
        this.authService = authService;
    }

    @GetMapping
    public String getRegisterPage(Model model) {
        model.addAttribute("shelters", this.shelterService.listShelters());
        model.addAttribute("organisations", this.organisationService.findAll());
        return "register";
    }

    @PostMapping
    public String registerUser(@RequestParam String name, @RequestParam String email,
                               @RequestParam String password, @RequestParam String repeatPassword,
                               @RequestParam String telephone,@RequestParam String role,
                               @RequestParam (required = false) String freeTime,  @RequestParam (required = false) String funds,
                               @RequestParam (required = false) boolean hasOtherPets, @RequestParam (required = false) boolean hasKids,
                               @RequestParam (required = false) String housing, @RequestParam (required = false) String physicalActivity,
                               @RequestParam (required = false) boolean willFoster, @RequestParam (required = false) Integer shelter,
                               @RequestParam (required = false)  String position, HttpServletRequest request) {

        if(role.equals("adopter") & password.equals(repeatPassword)){

            FreeTime ft = FreeTime.valueOf(freeTime);
            Funds f = Funds.valueOf(funds);
            Housing h = Housing.valueOf(housing);
            PhysicalActivity pa = PhysicalActivity.valueOf(physicalActivity);

            Adopter adopterUser = authService.registerAdopter(name, email, password, telephone,ft,f,hasOtherPets,hasKids,h,pa,willFoster);

            request.getSession().setAttribute("user",adopterUser);
            return "redirect:/home";
        }
        else if(role.equals("employee") & password.equals(repeatPassword)){

            Employee employeeUser = authService.registerEmployee(name, email, password, telephone,position,shelter);

            request.getSession().setAttribute("user",employeeUser);
            return "redirect:/home";
        }

        return "redirect:/register";
    }

}
