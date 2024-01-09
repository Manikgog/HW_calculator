package com.homework.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(){
        super();
    }

    public DivisionByZeroException(String message){
        super(message);
    }

    @Override
    public String toString(){
        return super.getMessage();
    }
}
