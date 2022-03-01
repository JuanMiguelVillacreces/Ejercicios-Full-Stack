package com.example.Juanmy.Profesor.application;

import com.example.Juanmy.Profesor.infraestructure.controller.dto.imput.ProfesorImputDTO;
import com.example.Juanmy.Profesor.infraestructure.controller.dto.output.ProfesorOutputDTO;
import com.example.Juanmy.Profesor.infraestructure.controller.dto.output.ProfesorOutputDTOList;

public interface IProfesor {
    public ProfesorOutputDTO addProfesor(ProfesorImputDTO profesor) throws Exception;
    public ProfesorOutputDTO findProfesoyrById(String id) throws Exception;
    public ProfesorOutputDTOList getAll();
    public void deleteProfesor(String id) throws Exception;
    public ProfesorOutputDTO updateProfesor(String id, ProfesorImputDTO profesorImputDTO) throws Exception;

}
