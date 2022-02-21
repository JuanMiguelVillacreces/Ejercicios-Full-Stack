package io.github.Juanmy.persona.errors;

import lombok.Data;

@Data
public class UnprocesableException extends RuntimeException {

    public UnprocesableException(String mensaje) {
        super(mensaje);
    }
}
