package com.tomasz_malek.realestateregister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String dashboard() {
        return "index";
    }
}
