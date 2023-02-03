package com.infineon.practices.practice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to the World of Infineon!";
    }
}
