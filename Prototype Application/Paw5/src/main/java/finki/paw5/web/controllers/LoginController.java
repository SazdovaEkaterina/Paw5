package finki.paw5.web.controllers;

import finki.paw5.model.entities.User;
import finki.paw5.model.exceptions.NonExistingArgumentsException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import finki.paw5.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public String register(){
        return "/login";
    }
    @PostMapping
    public String register(@RequestParam String email,  @RequestParam String password, HttpServletRequest request, Model model) throws NonExistingArgumentsException {

        if(email==null || email.equals("") || Objects.equals(password, "") || password==null){
            throw new NonExistingArgumentsException();
        }
        User user = authService.login(email,password);

        if(user!=null){
            request.getSession().setAttribute("user",user); //go smestuvam korisnikot vo sesija
            return "redirect:/home";
        }
        else{
            return "redirect:/login";
        }


    }
}