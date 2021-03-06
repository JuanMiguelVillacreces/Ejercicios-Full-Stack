package io.github.Juanmy.persona.infrastructure.controller;

import io.github.Juanmy.persona.application.PersonaService;
import io.github.Juanmy.persona.infrastructure.controller.dto.input.PersonaInputDto;
import io.github.Juanmy.persona.infrastructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("persona")
@RestController
public class CreatePersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping
    public PersonaOutputDto aniadirPesona(@RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaService.aniadirPersona(personaInputDto);
    }
}
