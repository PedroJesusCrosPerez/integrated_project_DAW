package app.proyecto.controller;

import app.proyecto.entity.UserAll;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "redirect:/home"; // Esto asume que tienes una vista llamada "home.html"
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Esto asume que tienes una vista llamada "home.html"
    }

    @GetMapping("/entity/userAll")
    public String testEntity(Model model) {
        model.addAttribute(new UserAll(3L, "pedro@gmail.es", "1234", "pedro", "cros"), "user");
        return "home"; // Esto asume que tienes una vista llamada "home.html"
    }
}
