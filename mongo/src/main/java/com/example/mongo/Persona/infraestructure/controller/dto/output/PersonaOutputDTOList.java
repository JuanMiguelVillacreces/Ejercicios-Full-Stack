package com.example.mongo.Persona.infraestructure.controller.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class PersonaOutputDTOList {
    private List<PersonaOutputDTO> personaOutputDtoList;
}
