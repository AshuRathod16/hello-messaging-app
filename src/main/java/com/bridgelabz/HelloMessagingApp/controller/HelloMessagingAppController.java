package com.bridgelabz.HelloMessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {
    @GetMapping("/getdata")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/querry")
    public String querryParam(@RequestParam String name){
        return "Hello" + " " + name + " " + "from Bridgelabz";
    }
}
