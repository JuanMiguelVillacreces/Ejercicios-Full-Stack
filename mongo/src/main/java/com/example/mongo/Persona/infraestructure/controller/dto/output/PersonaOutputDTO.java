package com.example.mongo.Persona.infraestructure.controller.dto.output;

import com.example.mongo.Persona.domain.PersonaEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PersonaOutputDTO {

    Integer id;
    String usuario;
    String password;
    String name;
    String surname;
    String company_email;
    String personal_email;
    String city;
    Boolean active;
    Date created_date;
    String imagen_url;
    Date termination_date;


    public PersonaOutputDTO (PersonaEntity personaEntity){
        if(personaEntity == null)
            return;
        setId(personaEntity.getId());
        setUsuario(personaEntity.getUsuario());
        setPassword(personaEntity.getPassword());
        setName(personaEntity.getName());
        setSurname(personaEntity.getSurname());
        setCompany_email(personaEntity.getCompany_email());
        setPersonal_email(personaEntity.getPersonal_email());
        setCity(personaEntity.getCity());
        setActive(personaEntity.getActive());
        setCreated_date(personaEntity.getCreated_date());
        setImagen_url(personaEntity.getImagen_url());
        setTermination_date(personaEntity.getTermination_date());

    }

    public PersonaOutputDTO(int size, List<PersonaOutputDTO> listaDTO) {

    }

    public PersonaOutputDTO(Integer id, String usuario, String password, String name, String surname, String company_email, String personal_email, String city, Boolean active, Date created_date, String imagen_url, Date termination_date) {
    }
}
