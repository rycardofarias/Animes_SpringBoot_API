package rycardofarias.animes.springboot.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import rycardofarias.animes.springboot.exception.BadRequestException;
import rycardofarias.animes.springboot.exception.BadResquestExceptionDetails;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExpetionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadResquestExceptionDetails>handlerBadRequestException(BadRequestException bre){
        return new ResponseEntity<>(
                BadResquestExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(bre.getMessage())
                        .developerMessage(bre.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }
}
