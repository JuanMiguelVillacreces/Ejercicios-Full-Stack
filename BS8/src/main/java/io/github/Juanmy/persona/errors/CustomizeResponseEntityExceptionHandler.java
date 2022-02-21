package io.github.Juanmy.persona.errors;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class CustomizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UnprocesableException.class)
    public final ResponseEntity<CustomError> excepciones (UnprocesableException unprocesableException){
        CustomError customError=new CustomError(new Date(),422,unprocesableException.getMessage());
        return new ResponseEntity<CustomError>(customError, HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<CustomError> excepciones (NotFoundException notFoundException){
        CustomError customError=new CustomError(new Date(),422,notFoundException.getMessage());
        return new ResponseEntity<CustomError>(customError, HttpStatus.NOT_FOUND);
    }

}
