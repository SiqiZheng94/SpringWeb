package com.example.springweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    private List<Message> messages = new ArrayList<>();

    @PostMapping("/api/messages")
    public void addMessage(@RequestBody Message message) {
        messages.add(message);
    }
    @GetMapping("/api/messages")
    public List<Message> getAllMessages() {
        return messages;
    }

    @DeleteMapping("/api/messages/{id}")
    public void deleteMessage(@PathVariable String id) {
        // Iterate through the list and remove the message with the specified ID

        Iterator<Message> iterator = messages.iterator();
        while (iterator.hasNext()) {
            Message msg = iterator.next();
            if (msg.getId().equals(id)) {
                iterator.remove();
            }
        }
    }
}
