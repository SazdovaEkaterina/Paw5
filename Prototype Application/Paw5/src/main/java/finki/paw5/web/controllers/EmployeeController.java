package finki.paw5.web.controllers;

import finki.paw5.service.AdopterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {
    private final AdopterService adopterService;

    public EmployeeController(AdopterService adopterService) {
        this.adopterService = adopterService;
    }


    @GetMapping("/approve-adopters")
    public String getHomePage(Model model){
        model.addAttribute("needApproval", this.adopterService.findAllThatNeedApproval());
        return "/approve-adopters";
    }
}
