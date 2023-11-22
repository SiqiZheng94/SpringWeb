package com.example.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello, world!";
    }

    @GetMapping("/api/hello/{name}")
    public String sayHello2(@PathVariable String name){
        return "Hello, " + name + "!";
    }

}
