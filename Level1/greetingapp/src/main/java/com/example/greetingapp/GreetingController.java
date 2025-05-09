package com.example.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greetingMsg(){
        return greetingService.greetingMsg();
    }

    @GetMapping("/personal")
    public String personalGreeting(@RequestParam(required=false) String firstName, @RequestParam(required = false) String lastName){
        if (firstName!=null && lastName!=null) return ("Hello "+firstName+" "+lastName);
        else if (firstName!=null) return "Hello"+firstName;
        else if (lastName!=null) return "Hello"+lastName;
        else return "Hello World";
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }

    @GetMapping("/{id}")
    public Greeting getGreeting(@PathVariable Long id) {
        return greetingService.getGreetingById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestParam String message) {
        return greetingService.updateGreeting(id, message);
    }

    @DeleteMapping("/{id}")
    public void deleteGreeting(@PathVariable Long id) {
        greetingService.deleteGreeting(id);
    }
}
