package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringApplication.class, args);

}
	
	@GetMapping("/maven")
	public String hola() {
		return "Hola Mundo Maven";
	}
}