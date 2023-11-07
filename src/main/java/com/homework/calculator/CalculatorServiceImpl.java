package com.homework.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int number1, int number2){
        int result = number1 + number2;
        return number1 + " + " + number2 + " = " + result;
    }

    public String minus(int number1, int number2){
        int result = number1 - number2;
        return number1 + " - " + number2 + " = " + result;
    }

    public String multiply(int number1, int number2){
        int result = number1 * number2;
        return number1 + " * " + number2 + " = " + result;
    }

    public String divide(int number1, int number2){
        if(number2 == 0){
            return "error -> division by zero";
        }
        int result = number1 / number2;
        return number1 + " / " + number2 + " = " + result;
    }
}