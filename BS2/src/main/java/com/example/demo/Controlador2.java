package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador2 {

    @Autowired
    @Qualifier("bean1")
    Persona p1;

    @Autowired
    @Qualifier("bean2")
    Persona p2;

    @Autowired
    @Qualifier("bean3")
    Persona p3;

    @Autowired
    PersonasInterface pi;
    @Autowired
    List<Ciudad> ciudades;
    @GetMapping("controlador2/getpersona")

    public String getControlador2(){
        pi.setedad(pi.getedad()*2);
        return pi.toString();
    }
    @GetMapping("controlador2/getciudad")
    public String getciudad(){
        return ciudades.toString();
    }

    @GetMapping("/controlador/bean/{nombre}")
    public String getbean(@PathVariable String nombre){

        if(nombre.equals("bean1")){
            return p1.toString();
        }

        if(nombre.equals("bean2")){
            return p2.toString();
        }

        if(nombre.equals("bean3")){
            return p3.toString();
        }
        return "No encontrado";
    }

}
