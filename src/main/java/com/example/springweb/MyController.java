package com.example.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/hello")
    public String sayHello(){
        return "hello, world!";
    }

}