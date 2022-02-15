package com.example.demo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PersonasInterface {
    public void setedad(int edad);
    int getedad();
    public void setnombre(String nombre);
    String getnombre();
    public void setciudad(String ciudad);
    String getciudad();
    void set ( String key, String value);
    public String toString();
    int getid();
    public void setid(int id);
    public Persona addPersona(Persona c);

}
