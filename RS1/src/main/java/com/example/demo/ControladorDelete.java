package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class ControladorDelete {

    @Autowired
    @Qualifier("Lista")
    List<Persona> personas;

    @DeleteMapping("/delete/{id}")
    public String borra(@PathVariable int id){

    for (int i=0;i<personas.size();i++) {
      if (personas.get(i).getId() == id) {
          personas.remove(i);
          return "Borrado";
      }
        }
    return "No encontrado";
    }

}
