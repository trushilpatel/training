package com.trushil.thymeleaf.demo.thymeleafDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("date", new java.util.Date());
        return "home" ;
    }
}
