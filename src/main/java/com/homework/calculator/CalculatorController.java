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
    public String plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2){
        return calculatorService.plus(number1, number2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2){
        return calculatorService.minus(number1, number2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2){
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2){
        return calculatorService.divide(number1, number2);
    }
}

