package com.example.InjectionDemo;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public String getMsg(){
        return "Hello from GreetService";
    }
}
