package com.app.travel.gateway.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = MissingAuthorizationHeaderException.class)
    public ResponseEntity<Object> exception(MissingAuthorizationHeaderException exception) {
        System.out.println("uso");
        return new ResponseEntity<>("Missing authorization header!", HttpStatus.UNAUTHORIZED);
    }



}