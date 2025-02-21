package com.spring.SpringLearner.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    //curl localhost:8080/hello -w "\n"
    @RequestMapping("/home")
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
}
