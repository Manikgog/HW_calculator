package com.homework.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private final CheckService checkService;

    public CalculatorServiceImpl(CheckService checkService){
        this.checkService = checkService;
    }

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        return number1 + number2;
    }

    public Integer minus(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        return number1 - number2;
    }

    public Integer multiply(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        return number1 * number2;
    }

    public Integer divide(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        checkService.checkingDivisionByZero(number2);
        return number1/number2;
    }
}