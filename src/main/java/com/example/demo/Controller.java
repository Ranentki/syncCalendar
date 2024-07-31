package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/hello")
    public String getString(){
        return "This string is awesome!";
    }

//    @GetMapping("/hello")
//    public void outString(){
//        System.out.println("Hello, world! But in terminal");
//    }
}
