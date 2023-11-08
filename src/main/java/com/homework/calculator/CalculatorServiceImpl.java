package com.homework.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }


    public Integer plus(Integer number1, Integer number2){
        return number1 + number2;
    }

    public Integer minus(Integer number1, Integer number2){
        return number1 - number2;
    }

    public Integer multiply(Integer number1, Integer number2){
        return number1 * number2;
    }

    public Integer divide(Integer number1, Integer number2){
        return number1 / number2;
    }
}