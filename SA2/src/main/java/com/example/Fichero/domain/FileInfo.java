package com.example.Fichero.domain;


import com.example.Fichero.infraestructure.dto.input.FicheroInputDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    private String name;
    private String url;
    private String extension;
    private Date fecha;

    public FileInfo(String name, String url, String extension) {
        this.id= getId();
        this.name = name;
        this.url = url;
        this.extension = extension;
        this.fecha = new Date();
    }
}