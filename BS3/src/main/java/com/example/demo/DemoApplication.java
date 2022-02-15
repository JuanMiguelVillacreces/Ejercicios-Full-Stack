package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	@Bean
	CommandLineRunner ejecutame2(){
		return p->{
			System.out.println("Hola desde la clase secundaria");
		};
	}
	@Bean
	CommandLineRunner ejecutame3(String... args){//se guardan en p
    return p -> {
      System.out.println("Soy la tercera clase");
      for (int i = 0; i < p.length; i++) {
		  System.out.println("Parametro " + i + " = " + p[i]);
      }
    };
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		}

}
