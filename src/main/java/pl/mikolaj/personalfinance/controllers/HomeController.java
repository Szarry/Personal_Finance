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
    public String register(Model model) {
        model.addAttribute("AppUser", new AppUser());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("AppUser") @Valid AppUser appUser, BindingResult result, Model model) {

            if (result.hasErrors()) {
                System.out.println("BŁEDY" + result);
                System.out.println(appUser);
            return "/register";
        }
        AppUser userByEmail = userService.findByEmail(appUser.getEmail());

            if(userByEmail==null) {
            userService.saveUser(appUser);
            return "redirect:/login";
        }else {
                String error = "e-mail zajęty!";
                model.addAttribute("message", error);
                return "/register";
            }
    }
}

