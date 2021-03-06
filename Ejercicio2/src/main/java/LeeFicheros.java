import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class LeeFicheros {

    public void leefichero(String ruta, List<Persona> lista) {
        File archivo = null;
        FileReader Fr = null;
        BufferedReader br = null;
        try {
            archivo = new File(ruta);
            Fr = new FileReader(archivo.toString());
            br = new BufferedReader(Fr);
            String linea;
            String delimiter =
                    ":";
            int edad;
            String nombre;

            String desconocida = "Desconocida";
            String ciudad;
            Optional<Integer> optedad = Optional.empty();
            Optional<String> optnombre;
            Optional<String> optciudad;

            while (((linea = br.readLine()) != null)) {

                String a[] = linea.split(delimiter);
                Persona p = new Persona();
        /* try {
          if (a[0].isEmpty()) {
            nombre = " ";
          } else {
            nombre = a[0];
          }
        } catch (IndexOutOfBoundsException e) {
          nombre = " ";
        } */
                optnombre = Optional.of(a[0]);
                p.setNombre(a[0]);
        /*try {
          if (a[1].isEmpty()) {
            ciudad = "Desconocida";
          } else {
            ciudad = a[1];
          }
        } catch (IndexOutOfBoundsException e) {
          ciudad = "Desconocida";
        }*/
                optciudad = Optional.of(a[1]);
                p.setCiudad(a[1]);
                lista.stream()
                        .filter(persona -> persona.getCiudad() == "")
                        .forEach(
                                (pe) -> {
                                    pe.setCiudad("Desconocida");
                                });

                try {
          /*if (a[2].isEmpty()) {
            edad = Integer.parseInt("0");
          } else {
            edad = Integer.parseInt(a[2]);
          }*/
                    optedad = Optional.of(Integer.valueOf(a[2]));
                    p.setEdad(Integer.parseInt(a[2]));
                } catch (IndexOutOfBoundsException e) {
                    p.setEdad(Integer.parseInt("0"));

                }
                //optnombre.get(), optciudad.get(), optedad.get()
                lista.add(p);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

