package com.example.Juanmy.Persona.infraestructure.controller;

import com.example.Juanmy.Persona.application.IPersona;
import com.example.Juanmy.Persona.infraestructure.controller.dto.imput.PersonaImputDTO;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorPersona {

  @Autowired
  IPersona personaService;

  @PostMapping()
  public PersonaOutputDTO addPersona(@RequestBody PersonaImputDTO personaDTO) throws Exception {
    return personaService.añadirUsuario(personaDTO);
  }

  @GetMapping("{id}")
  public PersonaOutputDTO findById(@PathVariable Integer id, @Value("simple") @RequestParam(name = "outputType", defaultValue = "simple", required = false)
          String outputType) throws Exception {
    return personaService.findById(id,outputType);
  }

  @GetMapping()
  public PersonaOutputDTOList getAll(
          @Value("simple") @RequestParam(name = "outputType", defaultValue = "simple", required = false)
                  String outputType) {
    return personaService.getAllPersonas(outputType);
  }

  @GetMapping("{usuario}/usuario")
  public PersonaOutputDTOList buscarPersonaUsuario(@PathVariable String usuario, @Value("simple") @RequestParam(name = "outputType", defaultValue = "simple", required = false)
          String outputType) {
    return personaService.findByUsuario(usuario,outputType);
  }

  @DeleteMapping("{id}")
  public void borrarPersona(@PathVariable Integer id) throws Exception {
    personaService.deletePersona(id);
  }

  @PutMapping("update/{id}")
  public PersonaOutputDTO actualizarUsuario(@PathVariable Integer id, @RequestBody PersonaImputDTO personaImputDTO) throws Exception {
    return personaService.updatePersona(id,personaImputDTO);
  }



}


