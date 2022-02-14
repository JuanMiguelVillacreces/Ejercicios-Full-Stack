package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasInterfaceImplement implements PersonasInterface {

    Persona persona= new Persona();
    public void setedad(int edad){

        persona.setEdad(edad);
    }

    public int getedad(){
        return persona.getEdad();
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

    public void set(String key, String value){
        if(key.equals("nombre")){
            persona.setNombre(value);
        }else if(key.equals("ciudad")){
            persona.setCiudad(value);
        }else if(key.equals("edad")){
            persona.setEdad(Integer.parseInt(value));
        }
    }

    @Override
    public String toString() {
        return "PersonasInterfaceImplement{" +
                "persona=" + persona +
                '}';
    }
}
