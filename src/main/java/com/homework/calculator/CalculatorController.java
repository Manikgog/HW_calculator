package com.homework.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello(){
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer number1,
                       @RequestParam(value = "num2", required = false) Integer number2){
        String resultOfCheck = checkNumbers(number1, number2);
        if(resultOfCheck == null){
            Integer result = calculatorService.plus(number1, number2);
            return number1 + " + " + number2 + " = " + result;
        }
        return resultOfCheck;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer number1,
                        @RequestParam(value = "num2", required = false) Integer number2){
        String resultOfCheck = checkNumbers(number1, number2);
        if(resultOfCheck == null){
            Integer result = calculatorService.minus(number1, number2);
            return number1 + " - " + number2 + " = " + result;
        }
        return resultOfCheck;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer number1,
                           @RequestParam(value = "num2", required = false) Integer number2){
        String resultOfCheck = checkNumbers(number1, number2);
        if(resultOfCheck == null){
            Integer result = calculatorService.multiply(number1, number2);
            return number1 + " * " + number2 + " = " + result;
        }
        return resultOfCheck;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer number1,
                         @RequestParam(value = "num2", required = false) Integer number2){
        String resultOfCheck = checkNumbers(number1, number2);
        if(resultOfCheck == null){
            if(number2 == 0){
                return "Ошибка! Делить на ноль нельзя.";
            }
            Integer result = calculatorService.divide(number1, number2);
            return number1 + " / " + number2 + " = " + result;
        }
        return resultOfCheck;
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
}

