package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//ControladorPost c1=new ControladorPost();

	}

	@Bean
	@Qualifier("Lista")
	List<Persona> personas(){
		List<Persona> personas=new ArrayList<>();
		return personas;
	}
	/*@Bean
	@Qualifier("bean1")
	Persona crear1(){
		Persona p = new Persona(25,"Juan","Jaen",9);
		return p;
	}

	@Bean
	@Qualifier("bean2")
	Persona crear2(){
		Persona p = new Persona(35,"Miguel","Cambil",12);
		return p;
	}

	@Bean
	@Qualifier("bean3")
	Persona crear3(){
		Persona p = new Persona(45,"aaaa","Jaaaaaa",2019);
		return p;
	}*/
}
