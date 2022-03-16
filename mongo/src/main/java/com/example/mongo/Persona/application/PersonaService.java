package com.example.mongo.Persona.application;


import com.example.mongo.Persona.domain.PersonaEntity;
import com.example.mongo.Persona.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.mongo.Persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class PersonaService implements IPersona {

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public PersonaOutputDTO añadirUsuario(PersonaInputDTO persona) throws Exception {
        persona.comprobarDTO();
        PersonaEntity p = new PersonaEntity(persona);
        mongoTemplate.save(p);
        PersonaOutputDTO personaOutputDTO = new PersonaOutputDTO(p);
        return personaOutputDTO;
    }


    @Override
    public PersonaOutputDTO findById(Integer id) throws Exception {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return new PersonaOutputDTO(mongoTemplate.findOne(query, PersonaEntity.class));
    }

    @Override
    public List<PersonaEntity> getAllPersonas() {

        List<PersonaEntity> listaPersonas = mongoTemplate.findAll(PersonaEntity.class);
        return listaPersonas;
    }

    @Override
    public PersonaOutputDTO findByUsuario(String usuario) {
        Query query = new Query();
        query.addCriteria(Criteria.where("usuario").is(usuario));
        return new PersonaOutputDTO(mongoTemplate.findOne(query, PersonaEntity.class));
    }

    @Override
    public void deletePersona(Integer id) throws Exception {

        PersonaEntity p = mongoTemplate.findById(id, PersonaEntity.class);

        mongoTemplate.remove(p);
    }

    @Override
    public PersonaOutputDTO updatePersona(Integer id, PersonaInputDTO personaImputDTO) {


        PersonaEntity p = mongoTemplate.findById(id, PersonaEntity.class);
        p.setUsuario(personaImputDTO.getUsuario());
        p.setName(personaImputDTO.getName());
        p.setSurname(personaImputDTO.getSurname());
        p.setCompany_email(personaImputDTO.getCompany_email());
        p.setPersonal_email(personaImputDTO.getPersonal_email());
        p.setCity(personaImputDTO.getCity());
        p.setActive(personaImputDTO.getActive());
        p.setImagen_url(personaImputDTO.getImagen_url());
        p.setTermination_date(personaImputDTO.getTermination_date());
        mongoTemplate.save(p);
        return this.toOutputDTO(p);
    }

    private PersonaOutputDTO toOutputDTO(PersonaEntity persona){
        return new PersonaOutputDTO(
                persona.getId(),
                persona.getUsuario(),
                persona.getPassword(),
                persona.getName(),
                persona.getSurname(),
                persona.getCompany_email(),
                persona.getPersonal_email(),
                persona.getCity(),
                persona.getActive(),
                persona.getCreated_date(),
               persona.getImagen_url(),
                persona.getTermination_date()
        );
    }

}
