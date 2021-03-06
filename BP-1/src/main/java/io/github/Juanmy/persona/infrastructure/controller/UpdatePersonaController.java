package io.github.Juanmy.persona.infrastructure.controller;

import io.github.Juanmy.persona.application.PersonaService;
import io.github.Juanmy.persona.infrastructure.controller.dto.input.PersonaInputDto;
import io.github.Juanmy.persona.infrastructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("persona")
@RestController
public class UpdatePersonaController {

    @Autowired
    PersonaService personaService;

    @PutMapping("{id}")
    public PersonaOutputDto modificarPersona(@PathVariable Integer id, @RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaService.modificarPersona(id, personaInputDto);
    }
}
