package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    //Get products
    @GetMapping("/products")
    public String getMessage() {
        return "A brand new product";
    }
}
