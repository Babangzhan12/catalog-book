package com.subrutin.bookcatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    // @RequestMapping(method = RequestMethod.GET, value = "/home")
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("message", "Hello world from SpringMVC + Thymeleaf");
        return "home";
    }
}
