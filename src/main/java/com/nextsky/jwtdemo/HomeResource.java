package com.nextsky.jwtdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/hello")
    public String helloWorld(){
        return "hello";
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return "hello admin";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "hello user";
    }
}
