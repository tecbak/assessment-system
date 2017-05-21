package ua.rud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.rud.service.UserService;

import java.util.Map;

@Controller
public class HomeController {
    private UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    @GetMapping({"/", "/hello"})
    public String showDefaultHomePage(ModelMap modelMap) {
        modelMap.addAttribute("name", "World");
        return "hello";
    }

//    @GetMapping({"/{message}"})
//    public String showHomePage(@PathVariable("message") String message, Map<String, Object> model) {
//        model.put("message", message);
//        return "hello";
//    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
