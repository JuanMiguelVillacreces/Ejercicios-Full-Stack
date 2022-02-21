package io.github.Juanmy.persona.errors;


import lombok.Getter;

import java.util.Date;
@Getter

public class CustomError {

    private Date timestamp;
    private int HttpCode;
    private String mensaje;

    public CustomError(Date timestamp, int httpCode, String mensaje) {
        super();
        this.timestamp = timestamp;
        this.HttpCode = httpCode;
        this.mensaje = mensaje;
    }
}
