package com.tien.ss01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/b1")
    public String b1() {
        return "b1";
    }

    @GetMapping("/b9")
    public String b9() {
        return "b9";
    }
}
