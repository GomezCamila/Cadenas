package com.example.cadenas.controllerCadenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Cadenas {
public static void main(String[]args) {
	SpringApplication.run(Cadenas.class, args);
}

	@RequestMapping("/")
	public String Saludo() {
		return "Hola cliente! ¿Como esta viendo el programa?";
	}
	
	@RequestMapping("/random")
	public String mensaje() {
		return "¡SpringBoot esta fincionando bien!";
	}
	

public Cadenas() {
		// TODO Auto-generated constructor stub
	

	
}
}
