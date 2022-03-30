package com.example.EJ2CRUD_VALIDACION;

import com.example.EJ2CRUD_VALIDACION.Persona.application.PersonaService;
import com.example.EJ2CRUD_VALIDACION.Persona.domain.PersonaEntity;
import com.example.EJ2CRUD_VALIDACION.Persona.infraestructure.controller.dto.imput.PersonaImputDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;

@SpringBootApplication
public class Ej2CrudValidacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ej2CrudValidacionApplication.class, args);
	}

	@Bean
	CommandLineRunner run(PersonaService personaService){

		return args -> {
			personaService.añadirUsuario(new PersonaImputDTO(new PersonaEntity(1, "Juanito", "1234"
					, "juan", "ito", "j@gmail.com", "n@gmail.com", "Jaén"
					, true, new Date(), "imgurl", new Date(), true)));
			personaService.añadirUsuario(new PersonaImputDTO(new PersonaEntity( 2,"joseramo", "1234"
					, "jose", "ramon", "r@gmail.com", "r@gmail.com", "Jaén"
					, true, new Date(), "imgurl", new Date(), false)));
		};

	}


	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS");
			}
		};
	}
}
