package com.springproject.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //to bind with spring project
public class firstController {
    
    @GetMapping("/welcome")
    public String first_api(){

        return "First API Project";
    }
}
