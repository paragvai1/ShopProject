package by.bigroi.wear.controller;

import by.bigroi.wear.model.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SecureController {

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/admin/**")
    public String adminPage(Model model) {
        model.addAttribute("message", "Page for admin only");
        return "admin";
    }

    @GetMapping("/secure/**")
    public String userPage(Model model) {
        model.addAttribute("message", "Page for authorized users only");
        return "secure";
    }

    @PostMapping("/j_spring_security_check")
    public String loginPage(@ModelAttribute("user") @Valid User user, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("message", "Login user error");
            return "login";
        } else {
            model.addAttribute("message", "You are on user page");
        }
        return "secure";
    }
}
