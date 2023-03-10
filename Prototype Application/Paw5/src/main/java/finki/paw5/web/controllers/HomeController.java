package finki.paw5.web.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHomePage(HttpServletRequest request) {
        if(request.getSession().getAttribute("user")==null){
            return "redirect:/login";
        }
        return "home";
    }

    @GetMapping("/aboutUs")
    public String getAboutUsPage(){
        return "/aboutUs";
    }
}
