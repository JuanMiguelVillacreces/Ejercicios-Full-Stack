package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController()

public class Controlador1 {

    @GetMapping("/user/{nombre}")
    public String gethola(@PathVariable String nombre){
        return "Hola: " + nombre;
    }
    @PostMapping("/useradd")
   public Persona usseradd(@RequestBody Persona p){

    p.setEdad(p.getEdad()+1);
        return p;
    }

}
