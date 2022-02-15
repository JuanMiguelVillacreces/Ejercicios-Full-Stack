package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("persona")
public class ControladorPost {
    @Autowired
    PersonasInterface pi;

    @Autowired
    @Qualifier("Lista")
    List<Persona> personas;

    @PostMapping("/add")
    public Persona addPersona(@RequestBody Persona c) {
       Persona p=pi.addPersona(c);
       return p;
    }


}