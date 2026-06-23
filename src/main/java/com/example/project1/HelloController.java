/*public class HelloController {*/
    package com.example.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Anjaneyulu, your Spring Boot app is working!";
    }
}


