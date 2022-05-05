package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @PostMapping("/post")
    public String postGenericObject() {
        System.out.println("************************************************************");

        System.out.println("************************************************************");
        return "HI kalai";
    }

}
