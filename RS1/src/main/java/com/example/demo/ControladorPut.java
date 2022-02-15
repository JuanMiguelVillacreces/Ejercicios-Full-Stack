package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("persona")
public class ControladorPut {

    @Autowired
    @Qualifier("Lista")
    List<Persona> personas;

    @PutMapping("/{id}")
    public void modifica(@PathVariable int id, @RequestBody Persona per){

        int a=0;

        for(Persona p : personas){
            if(p.getId()==id){
                if(per.getEdad()!=0)p.setEdad(per.getEdad());
                if(per.getNombre()!="")p.setNombre(per.getNombre());
                if(per.getCiudad()!="")p.setCiudad(per.getCiudad());

            }
        }
    }

}
