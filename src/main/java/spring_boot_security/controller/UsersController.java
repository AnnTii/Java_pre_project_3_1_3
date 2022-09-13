package spring_boot_security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UsersController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "/user/login";
    }

    @GetMapping("/user")
    public String getCurrentUserInfo(Model model) {
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return "/user/user";
    }
}