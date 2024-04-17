package org.example.crossplat_lab1;
import org.example.crossplat_lab1.Method_1.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

import static org.springframework.http.RequestEntity.put;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "Hello Spring!");
        model.addAttribute("languages", List.of("Java", "Kotlin", "Groovy"));
        model.addAttribute("username", "Bondareva Daria");
        model.addAttribute("user",new User("Wiwat","Rtyp"));
        model.addAttribute("capitalOfCountry", new HashMap<String, String>(){{
            put("Germany","Berlin");
            put("Italy","Rome");

        }});
        model.addAttribute("user_1", List.of(new User("Daria", "Bondareva"), new User("Petro", "Schur"), new User("Maria", "Ivanova")));
        model.addAttribute("user_3", "dashboard.Bondareva");
        return "index";
    }

}
