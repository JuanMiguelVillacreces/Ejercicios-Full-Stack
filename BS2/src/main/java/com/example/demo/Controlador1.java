package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()

public class Controlador1 {
    @Autowired
     PersonasInterface pi;
    @Autowired
    List<Ciudad> ciudades = new ArrayList<Ciudad>();
 /*   @GetMapping("/user/{nombre}")
    public String gethola(@PathVariable String nombre){
        return "Hola: " + nombre;
    }
    @PostMapping("/useradd")
    public Persona usseradd(@RequestBody Persona p){

        p.setEdad(p.getEdad()+1);
        return p;
    }*/
    @GetMapping("/controlador1/addpersona")
    public String getPersona2(@RequestHeader String nombre, @RequestHeader String ciudad, @RequestHeader int edad){

        pi.setciudad(ciudad);
        pi.setedad(edad);
        pi.setnombre(nombre);
        return pi.toString();
    }

  @PostMapping("/controlador1/addciudad")
  public void addciudad(@RequestBody Ciudad c) {
    c.setNombre(c.getNombre());
    c.setNumerohab(c.getNumerohab());
    ciudades.add(c);
   /* if (!ciudades.isEmpty()) {


      for (int i = 0; i < ciudades.size(); i++) {
        return ciudades;
      }
    }
    Ciudad a=new Ciudad("nulo",0);
    ciudades.add(a);*/
   // return ciudades;
    }


}