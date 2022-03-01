package com.example.Juanmy.Persona.infraestructure.controller.dto.output;

import com.example.Juanmy.Persona.domain.PersonaEntity;
import com.example.Juanmy.Profesor.domain.ProfesorEntity;
import com.example.Juanmy.Student.infraestructure.controller.dto.output.StudentOutputDTO;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PersonaOutputDTOFullProfesor extends PersonaOutputDTO{


    String idProfesor;
    String comments;
    String branch;
    List<StudentOutputDTO> alumnos;

    public PersonaOutputDTOFullProfesor(PersonaEntity p, ProfesorEntity pr){
        super(p);
        setIdProfesor(pr.getIdProfesor());
        setComments(pr.getComments());
        setBranch(pr.getBranch());
        if(pr.getEstudiantes() != null)
            setAlumnos(pr.getEstudiantes().stream().map(StudentOutputDTO::new).collect(Collectors.toList()));


    }

}
