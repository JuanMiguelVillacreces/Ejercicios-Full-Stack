package com.company;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here

    String ruta = "personas.txt";
    List<Persona> listap = new ArrayList<>();
    Leeficheros lee = new Leeficheros();
    lee.leefichero(ruta, listap);

    /*   for (Persona model : listap) {
      System.out.println(model.getNombre());
      System.out.println(model.getCiudad());
      System.out.println(model.getEdad());
      System.out.println("-------------");
    }*/

    listap.stream()
        .filter(persona -> persona.getEdad() < 25)
        .forEach(
            (p) -> {
              System.out.println("Nombre: " + p.getNombre() + " Poblacion: " + p.getCiudad() + " Edad: " + p.getEdad());
              });
  }
}
