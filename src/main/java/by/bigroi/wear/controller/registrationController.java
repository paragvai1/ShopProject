package by.bigroi.wear.controller;

import by.bigroi.wear.model.user.User;
import by.bigroi.wear.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class RegistrationController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String welcome() {
        return "welcomePage";
    }

    @GetMapping("/regForm")
    public String regForm(Locale locale,Model model) {
        model.addAttribute("user", new User());
        return "regForm";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute ("user") @Valid User user, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("message", "Save User Error");
        } else {
            model.addAttribute("message", userService.addUser(user));
        }
        return "regForm";
    }

    @GetMapping("/enterForm")
    public String enterForm(Locale locale,Model model) {
        model.addAttribute("user", new User());
        return "enterForm";
    }

    @PostMapping("/checkUser")
    public String checkUser(@ModelAttribute("user") @Valid User user, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("message", "Help! Check User Error!");
        } else {
           if(userService.isUserRegistered(user)) {
                   model.addAttribute("message", "Hello! Glad to see you!");
           } else {
               model.addAttribute("message", "Can't find you in database. Try again or register now!");
           }
        }
        return "enterForm";
    }

}

