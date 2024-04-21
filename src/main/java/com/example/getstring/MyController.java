package com.example.getstring;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class MyController {
    @GetMapping("/")
    public String output(){
        return "Welcome to Spring Boot";
    }
}