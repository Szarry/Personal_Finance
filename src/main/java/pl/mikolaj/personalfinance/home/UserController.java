package pl.mikolaj.personalfinance.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.mikolaj.personalfinance.User.AppUser;
import pl.mikolaj.personalfinance.User.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String home() {
        return "user/index";
    }

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        AppUser appUser = new AppUser();
        appUser.setUsername("user");
        appUser.setPassword("user");
        appUser.setEmail("user@gmail.com");
        appUser.setFirstname("Mikołaj");
        appUser.setLastname("Pytlarczyk");
        userService.saveUser(appUser);
        return "admin";
    }

}
