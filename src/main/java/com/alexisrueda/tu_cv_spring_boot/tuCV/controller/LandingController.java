package com.alexisrueda.tu_cv_spring_boot.tuCV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {

    @GetMapping("/cv-form")
    public String form() {
        return "cv-form";
    }
}
