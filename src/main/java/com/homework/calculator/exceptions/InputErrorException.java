package com.homework.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InputErrorException extends RuntimeException {
    public InputErrorException(){
        super();
    }

    public InputErrorException(String message){
        super(message);
    }

    @Override
    public String toString(){
        return super.getMessage();
    }

}
