package com.example.ejercicio8;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("perfil1")
@Component
public class Perfil_1  implements Perfil{
    String perfil;


    @Override
    @GetMapping("/perfil")
    public void miFuncion() {System.out.println("Este es el perfil 1");

    }
}
