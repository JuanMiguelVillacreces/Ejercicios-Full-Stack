package io.github.Juanmy.persona.errors;

import lombok.Data;

@Data
public class NotFoundException extends RuntimeException {



    public NotFoundException(String mensaje) {
        super(mensaje);

    }

}
