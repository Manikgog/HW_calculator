package com.homework.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public String checkNumbers(Integer number1, Integer number2){
        if(number1 == null && number2 == null){
            return "Ошибка: необходимо ввести значения.";
        }else if(number1 == null){
            return "Ошибка: необходимо ввести значение num1.";
        }else if(number2 == null){
            return "Ошибка: необходимо ввести значение num2.";
        }
        return null;
    }
    public String plus(Integer number1, Integer number2){
        String resultString = checkNumbers(number1, number2);
        if(resultString != null){
            return resultString;
        }
        Integer result = number1 + number2;
        return number1 + " + " + number2 + " = " + result;
    }

    public String minus(Integer number1, Integer number2){
        String resultString = checkNumbers(number1, number2);
        if(resultString != null){
            return resultString;
        }
        int result = number1 - number2;
        return number1 + " - " + number2 + " = " + result;
    }

    public String multiply(Integer number1, Integer number2){
        String resultString = checkNumbers(number1, number2);
        if(resultString != null){
            return resultString;
        }
        int result = number1 * number2;
        return number1 + " * " + number2 + " = " + result;
    }

    public String divide(Integer number1, Integer number2){
        String resultString = checkNumbers(number1, number2);
        if(resultString != null){
            return resultString;
        }
        if(number2 == 0){
            return "Ошибка! Делить на ноль нельзя.";
        }
        int result = number1 / number2;
        return number1 + " / " + number2 + " = " + result;
    }
}