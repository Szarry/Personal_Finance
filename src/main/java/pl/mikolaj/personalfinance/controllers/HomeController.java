package pl.mikolaj.personalfinance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mikolaj.personalfinance.DAO.User.AppUser;
import pl.mikolaj.personalfinance.DAO.User.UserRepository;
import pl.mikolaj.personalfinance.DAO.User.UserService;

import javax.validation.Valid;



@Controller
@RequestMapping("/")
public class HomeController {

    private final UserService userService;

    public HomeController(UserRepository userRepository, UserService userService) {
        this.userService = userService;
    }

                                                         // REGISTRATION //
    @GetMapping("/register")
    public String register (Model model) {
        model.addAttribute("AppUser", new AppUser());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("AppUser")@Valid AppUser appUser, BindingResult result) {

        if (result.hasErrors()) {
            return "/register";
        } else {
            userService.saveUser(appUser);
       }
        return "redirect:/login";
    }


}
