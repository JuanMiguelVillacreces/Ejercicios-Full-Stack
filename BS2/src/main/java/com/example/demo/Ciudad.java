package com.example.demo;

public class Ciudad {

    private String nombre;
    private int numerohab;

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", numerohab=" + numerohab +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerohab() {
        return numerohab;
    }

    public void setNumerohab(int numerohab) {
        this.numerohab = numerohab;
    }

    public Ciudad(String nombre, int numerohab) {
        this.nombre = nombre;
        this.numerohab = numerohab;
    }
}
