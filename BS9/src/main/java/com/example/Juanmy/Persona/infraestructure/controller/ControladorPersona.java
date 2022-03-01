package com.example.Juanmy.Persona.infraestructure.controller;

import com.example.Juanmy.Persona.application.IPersona;
import com.example.Juanmy.Persona.infraestructure.controller.dto.imput.PersonaImputDTO;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTOFullProfesor;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTOList;
import com.example.Juanmy.Profesor.application.IProfesor;
import com.example.Juanmy.Profesor.application.ProfesorService;
import com.example.Juanmy.Profesor.infraestructure.controller.IFeign;
import com.example.Juanmy.Profesor.infraestructure.controller.dto.output.ProfesorOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@RequestMapping("persona")
@RestController
public class ControladorPersona {

  @Autowired
  IPersona personaService;

  @Autowired
  IFeign iFeign;
//  @Autowired
//  IProfesor profesorService;

  @PostMapping()
  public PersonaOutputDTO addPersona(@RequestBody PersonaImputDTO personaDTO) throws Exception {
    return personaService.añadirUsuario(personaDTO);
  }

  @GetMapping("{id}")
  public PersonaOutputDTO findById(@PathVariable Integer id, @Value("simple") @RequestParam(name = "outputType", defaultValue = "simple", required = false)
          String outputType) throws Exception {
    return personaService.findById(id,outputType);
  }


  @GetMapping("/profesores/{id}")
  ResponseEntity<ProfesorOutputDTO>getProfesorRestTemplate(@PathVariable String id){

    System.out.println("En client Resttemplate. Antes de llamada a server Profesor: "+id);

    ResponseEntity<ProfesorOutputDTO> rs = new RestTemplate().getForEntity("http://localhost:8081/profesor/"+id,ProfesorOutputDTO.class);

    System.out.println("En client Resttemplate. Despues de llamada a server");

    return ResponseEntity.ok(rs.getBody());

  }

  @GetMapping("/feign/{id}")
  ResponseEntity<ProfesorOutputDTO> getProfesorFeign(@PathVariable String id){
    ResponseEntity<ProfesorOutputDTO> response = iFeign.getProfesorFeign(id);
    return response;
  }

  /* public ResponseEntity<PersonaOutputDTOFullProfesor> getById(@PathVariable Integer id) throws Exception
  {
    return new RestTemplate().getForEntity("http://localhost:8081/profesores/",PersonaOutputDTOFullProfesor.class);
  }

*/


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


