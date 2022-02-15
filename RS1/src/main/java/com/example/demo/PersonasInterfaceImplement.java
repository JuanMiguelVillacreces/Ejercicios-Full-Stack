package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import java.util.ArrayList;

@Service("PersonaService")

public class PersonasInterfaceImplement implements PersonasInterface {

    Persona persona= new Persona();

    @Autowired
    @Qualifier("Lista")
    List<Persona> personas;


    public void setedad(int edad){

        persona.setEdad(edad);
    }

    public int getedad(){
        return persona.getEdad();
    }

    public void setid(int id){

        persona.setId(id);
    }

    public int getid(){
        return persona.getId();
    }

    public void setnombre(String nombre){
        persona.setNombre(nombre);
    }

    public String getnombre(){

        return persona.getNombre();
    }

    public void setciudad(String ciudad){
        persona.setCiudad(ciudad);
    }

    public String getciudad(){

        return persona.getCiudad();
    }

    public void set(String key, String value) {
        if (key.equals("nombre")) {
            persona.setNombre(value);
        } else if (key.equals("ciudad")) {
            persona.setCiudad(value);
        } else if (key.equals("edad")) {
            persona.setEdad(Integer.parseInt(value));
        } else if (key.equals("id")) {
            persona.setId(Integer.parseInt(value));
        }
    }

    @Override
    public String toString() {
        return "PersonasInterfaceImplement{" +
                "persona=" + persona +
                '}';
    }

    public Persona addPersona(Persona c) {
        c.setNombre(c.getNombre());
        c.setId(c.getId());
        c.setCiudad(c.getCiudad());
        c.setEdad(c.getEdad());
        personas.add(c);
        return c;
    }



}
