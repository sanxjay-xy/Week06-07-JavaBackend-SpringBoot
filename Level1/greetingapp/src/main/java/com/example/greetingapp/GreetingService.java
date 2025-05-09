package com.example.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository repository;

    public String greetingMsg(){
        return "Hello World";
    }

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);
        return repository.save(greeting);
    }

    public Optional<Greeting> getGreetingById(Long id) {
        return repository.findById(id);
    }

    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }

    public Greeting updateGreeting(Long id, String newMessage) {
        Greeting greeting = repository.findById(id).orElseThrow();
        greeting.setMessage(newMessage);
        return repository.save(greeting);
    }

    public void deleteGreeting(Long id) {
        repository.deleteById(id);
    }
}