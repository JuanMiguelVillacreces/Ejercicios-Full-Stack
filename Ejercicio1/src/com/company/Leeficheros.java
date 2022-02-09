package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leeficheros {


    public void leefichero(String ruta, List<Persona> lista){
              File archivo = null;
            FileReader Fr = null;
            BufferedReader br = null;
            try {
                archivo = new File(ruta); // Ruta desde donde se lee el txt
                Fr = new FileReader(archivo.toString());
                br = new BufferedReader(Fr);
                String linea;
                String delimiter = ":"; //Separador dentro del txt. Cuando crees tu archivo de texto en la maquina separa los números por comas. No los pongas en linea recta, pon uno sobre otro
                int edad;
                String nombre;
                String ciudad;




                while (((linea = br.readLine()) != null)) {

                    String a[]=linea.split(delimiter);

                    try{
                        if (a[0].isEmpty()){
                            nombre=" ";
                        }else {
                            nombre=a[0];
                        }
                    }catch (IndexOutOfBoundsException e){
                            nombre=" ";
                    }

                    try{
                        if (a[1].isEmpty()){
                            ciudad="Desconocida";
                        }else {
                            ciudad=a[1];
                        }
                    }catch (IndexOutOfBoundsException e){
                        ciudad="Desconocida";
                    }

                    try{
                        if (a[2].isEmpty()){
                            edad= Integer.parseInt("0");
                        }else {
                            edad= Integer.parseInt(a[2]);
                        }
                    }catch (IndexOutOfBoundsException e){
                        edad= Integer.parseInt("0");
                    }
                    Persona p= new Persona(nombre,ciudad,edad);
                    lista.add(p);
                }

            } catch (IOException e) {
                System.out.println(e);
            }
        }




}