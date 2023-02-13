package finki.paw5.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHomePage(){
        return "home";
    }
    @GetMapping("/aboutUs")
    public String getSuccessPage(){
        return "/aboutUs";
    }
}
