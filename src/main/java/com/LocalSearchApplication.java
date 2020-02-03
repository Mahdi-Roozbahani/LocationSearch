package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@SpringBootApplication
public class LocalSearchApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LocalSearchApplication.class, args);
	}

}
