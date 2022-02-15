package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase1 {

    @PostConstruct
    void ejecutame(){
    System.out.println("Hola desde clase inicial");
    }

}
