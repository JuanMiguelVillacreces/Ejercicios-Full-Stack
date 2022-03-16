package com.example.mongo.Persona.application;

import com.example.mongo.Persona.domain.PersonaEntity;
import com.example.mongo.Persona.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.mongo.Persona.infraestructure.controller.dto.output.PersonaOutputDTO;

import java.util.List;

public interface IPersona {

    public PersonaOutputDTO añadirUsuario(PersonaInputDTO persona) throws Exception;

    public PersonaOutputDTO findById(Integer id) throws Exception;

    public List<PersonaEntity> getAllPersonas();

    public PersonaOutputDTO findByUsuario(String usuario);
    public void deletePersona(Integer id) throws Exception;

    public PersonaOutputDTO updatePersona(Integer id, PersonaInputDTO personaImputDTO)
            throws Exception;
}
