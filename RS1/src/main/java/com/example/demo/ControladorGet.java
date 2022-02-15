package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("persona")
@RestController
public class ControladorGet {

    @Autowired
    PersonasInterface pi;

    @Autowired
    @Qualifier("Lista")
    List<Persona> personas;

    @GetMapping("/muestra")
    public String lista(){

        return personas.toString();
    }

}
