package com.example.spring_template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping("/getTheMessage")
    public String getTheMessage() {
        return "Endpoint example";
    }
}
