package com.example.Juanmy.Student.infraestructure.controller.dto.output;

import com.example.Juanmy.Estudiante_Asignatura.domain.EstudianteAsignaturaEntity;
import com.example.Juanmy.Student.domain.StudentEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentOutputDTO {

  String id;
  String idPersona;
  int numHoursWeek;
  String idProfesor;
  String branch;
  String comments;
  List<String> asignaturas;

  public StudentOutputDTO(StudentEntity studentEntity) {
    if (studentEntity == null) return;
    setId(studentEntity.getId());
    setIdPersona(String.valueOf(studentEntity.getPersona().getId()));
    if (studentEntity.getProfesor() != null)
      setIdProfesor(studentEntity.getProfesor().getIdProfesor());
    setNumHoursWeek(studentEntity.getNumHoursWeek());
    setBranch(studentEntity.getBranch());
    if (studentEntity.getAsignaturas() != null) {
      setAsignaturas(convertirListaAsignaturasaListaIds(studentEntity.getAsignaturas()));
    }
    setComments(studentEntity.getComments());
  }

  List<String> convertirListaAsignaturasaListaIds(List<EstudianteAsignaturaEntity> asignaturas) {
    List<String> idAsignaturas = new ArrayList<>();
    for (int i = 0; i < asignaturas.size(); i++) {
      idAsignaturas.add(asignaturas.get(i).getIdAsigntura());
    }
    return idAsignaturas;
  }
}
