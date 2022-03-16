package com.example.mongo.Persona.domain;
import com.example.mongo.Persona.infraestructure.controller.dto.input.PersonaInputDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "Persona")
public class PersonaEntity implements Serializable {
    @Id
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

    public PersonaEntity(PersonaInputDTO personaDTO) throws Exception {
        if (personaDTO == null) return;
        setId(personaDTO.getId());

        setUsuario(personaDTO.getUsuario());

        setPassword(personaDTO.getPassword());

        setName(personaDTO.getName());

        setSurname(personaDTO.getSurname());

        setCompany_email(personaDTO.getCompany_email());

        setPersonal_email(personaDTO.getPersonal_email());

        setCity(personaDTO.getCity());

        setActive(personaDTO.getActive());

        setCreated_date(personaDTO.getCreated_date());

        setImagen_url(personaDTO.getImagen_url());

        setTermination_date(personaDTO.getTermination_date());
    }


    @Override
    public String toString() {
        return "PersonaEntity{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company_email='" + company_email + '\'' +
                ", personal_email='" + personal_email + '\'' +
                ", city='" + city + '\'' +
                ", active=" + active +
                ", created_date=" + created_date +
                ", imagen_url='" + imagen_url + '\'' +
                ", termination_date=" + termination_date +
                '}';
    }
}
