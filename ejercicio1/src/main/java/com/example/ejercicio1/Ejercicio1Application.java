package com.example.ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

}
