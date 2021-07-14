package com.example.springbootdocker.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
public class DevHomeController {
    @GetMapping("/")
    public String homeDev() {
        return "Hello Docker World - dev";
    }
}
