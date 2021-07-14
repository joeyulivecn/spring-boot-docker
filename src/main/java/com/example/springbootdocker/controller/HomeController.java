package com.example.springbootdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
