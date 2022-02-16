package com.example.ejercicio8;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("perfil2")
@Component
public class Perfil_2 implements Perfil{
    private String perfil;

    @Override
    @GetMapping("/perfil")
    public void miFuncion() {
        System.out.println("Este es el perfil 2");
    }

}
