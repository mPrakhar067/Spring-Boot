package com.springboot.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    // adding a new endpoint workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "workout check";
    }
}
