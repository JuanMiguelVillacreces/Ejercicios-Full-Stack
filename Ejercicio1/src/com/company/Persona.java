package com.company;

public class Persona {

    private int edad;
    private String nombre;
    private String ciudad;

    public Persona(String nombre, String ciudad,int edad) {
        this.edad = edad;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Persona() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
