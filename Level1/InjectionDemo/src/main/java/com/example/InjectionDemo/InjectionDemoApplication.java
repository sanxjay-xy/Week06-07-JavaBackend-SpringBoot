package com.example.InjectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectionDemoApplication.class, args);
	}

}

// When this file is run, GreetService is injected into GreetController using a constructor
// This is then accessed through the /greet endpoint at http://localhost:8080/greet
// Thus, 'Dependency Injection' has been demonstrated.