package com.example.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Hamid Khatami (khatami@caspco.ir)
 * @version 1.0 2024.0521
 * @since 1.0
 */

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "home";
    }
}
