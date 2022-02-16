package com.example.ejercicio8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource({"classpath:miconfiguracion.properties","classpath:application.properties"})


@RestController
public class Configuracion {

    @Value("${var1}")
    private String var1;
    @Value("${var2}")
    private String var2;
    @Value("${var3}")
    private String var3;
    @Value("${var4}")
    private String var4;




    @GetMapping("/parametros")
    public String devolverValores(){
        return var1+" " +var2;
    }

    @GetMapping("/misvariables")
    public String devolvermisvariables(){
        return var1+" "+var2+" "+var3+" "+var4;
    }



}
