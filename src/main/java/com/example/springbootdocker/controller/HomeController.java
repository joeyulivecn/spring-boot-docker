package com.example.springbootdocker.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("prod")
@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello Docker World - prod";
    }

}
