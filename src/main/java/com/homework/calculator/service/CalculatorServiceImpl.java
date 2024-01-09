package com.homework.calculator.service;

import com.homework.calculator.service.CalculatorService;
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

    public String plus(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }

    public String minus(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        return number1 + " - " + number2 + " = " + (number1 - number2);
    }

    public String multiply(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    public String divide(Integer number1, Integer number2){
        checkService.checkNumbers(number1, number2);
        checkService.checkingDivisionByZero(number2);
        return number1 + " / " + number2 + " = " + (number1/number2);
    }
}