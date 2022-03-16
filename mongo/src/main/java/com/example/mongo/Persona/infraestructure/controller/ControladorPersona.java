package com.example.mongo.Persona.infraestructure.controller;


import com.example.mongo.Persona.application.IPersona;
import com.example.mongo.Persona.domain.PersonaEntity;
import com.example.mongo.Persona.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.mongo.Persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorPersona {

    @Autowired
    IPersona personaService;

    @PostMapping()
    public PersonaOutputDTO addPersona(@RequestBody PersonaInputDTO personaDTO) throws Exception {
        return personaService.añadirUsuario(personaDTO);
    }

    @GetMapping("{id}")
    public PersonaOutputDTO findById(@PathVariable Integer id) throws Exception {
        return personaService.findById(id);
    }

    @GetMapping()
    public List<PersonaEntity> getAll() {
        return personaService.getAllPersonas();
    }

    @DeleteMapping("{id}")
    public void borrarPersona(@PathVariable Integer id) throws Exception {
        personaService.deletePersona(id);
    }

    @PutMapping("update/{id}")
    public PersonaOutputDTO actualizarUsuario(@PathVariable Integer id, @RequestBody PersonaInputDTO personaImputDTO) throws Exception {
        return personaService.updatePersona(id,personaImputDTO);
    }



}


