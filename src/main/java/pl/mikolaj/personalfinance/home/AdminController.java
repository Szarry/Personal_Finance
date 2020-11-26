package pl.mikolaj.personalfinance.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/")
    public String home() {
        return "admin/index";
    }

    @PostMapping("/")
    public String dupa(){
        return "redirect:/";
    }


}
