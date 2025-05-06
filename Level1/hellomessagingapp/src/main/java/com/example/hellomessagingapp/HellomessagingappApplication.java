package com.example.hellomessagingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellomessagingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellomessagingappApplication.class, args);
	}

}

/*
UC 1:
URL: http://localhost:8080/hello
Method: GET
Response: Hello from BridgeLabz

UC 2:
URL: http://localhost:8080/hello/query?name=Sanjay
Method: GET
Response: Hello Sanjay from BridgeLabz

UC 3:
URL: http://localhost:8080/hello/param/Sanjay
Method: GET
Response: Hello Sanjay from BridgeLabz

UC 4:
URL: http://localhost:8080/hello/post
Method: POST
Request Body (JSON):
{
  "firstName": "Sanjay",
  "lastName": "Praveen"
}
Response: Hello Sanjay Praveen from BridgeLabz

UC 5:
URL: http://localhost:8080/hello/put/Sanjay?lastName=Praveen
Method: PUT
Response: Hello Sanjay Praveen from BridgeLabz
*/