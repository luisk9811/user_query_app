package co.com.bancolombia.controller;

import co.com.bancolombia.model.User;
import co.com.bancolombia.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/find-user-by-id")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String showForm() {
        return "user-form";
    }

    @PostMapping("/search")
    public String searchUser(@RequestParam("id") Long id, Model model) {
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
        } else {
            model.addAttribute("error", "Usuario no encontrado");
        }
        return "user-form";
    }
}