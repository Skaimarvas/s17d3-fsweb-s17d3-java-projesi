package com.example.zoo.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;


/**Notes:
 * @ControllerAdvice purpose:
 * centralized exception handling
 *---------------------------------
 * Beside ZooException handling, we handle errors via Exception class
 *----------------------------------
 * What is AOP (Aspect Oriented Programming)?:
 * Aspect-Oriented Programming (AOP) is a programming paradigm that aims
 * to increase modularity by allowing the separation of cross-cutting concerns.
 */
@ControllerAdvice
public class GlobalErrorHandlerException {
    @ExceptionHandler(ZooException.class)
    public ResponseEntity<ZooErrorResponse> handleException(ZooException zooException){
        ZooErrorResponse zooErrorResponse =
                new ZooErrorResponse(zooException.getStatus().value(), zooException.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(zooErrorResponse,zooException.getStatus());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ZooErrorResponse> handleException(Exception exception){
        ZooErrorResponse zooErrorResponse =
                new ZooErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage(),LocalDateTime.now());
        return new ResponseEntity<>(zooErrorResponse, HttpStatus.BAD_REQUEST);
    }
}
