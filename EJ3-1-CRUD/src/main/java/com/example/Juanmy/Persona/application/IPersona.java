package com.example.Juanmy.Persona.application;

import com.example.Juanmy.Persona.infraestructure.controller.dto.imput.PersonaImputDTO;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.Juanmy.Persona.infraestructure.controller.dto.output.PersonaOutputDTOList;

public interface IPersona {

  public PersonaOutputDTO añadirUsuario(PersonaImputDTO persona) throws Exception;

  public PersonaOutputDTO findById(Integer id,String parametro) throws Exception;

  public PersonaOutputDTOList getAllPersonas(String parametro);

  public PersonaOutputDTOList findByUsuario(String usuario, String parametro);
  public void deletePersona(Integer id) throws Exception;

  public PersonaOutputDTO updatePersona(Integer id, PersonaImputDTO personaImputDTO)
      throws Exception;
}
