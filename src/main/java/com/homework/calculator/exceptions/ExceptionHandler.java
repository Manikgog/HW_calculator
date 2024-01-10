package com.homework.calculator.exceptions;

import com.homework.calculator.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(InputErrorException.class)
    public ResponseEntity<ErrorMessage> addQuestionException(InputErrorException exception){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorMessage(exception.getMessage()));
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(DivisionByZeroException.class)
    public ResponseEntity<ErrorMessage> wrongQuestionException(DivisionByZeroException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage(exception.getMessage()));
    }

}