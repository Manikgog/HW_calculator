package com.homework.calculator.service;

import com.homework.calculator.exceptions.InputErrorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    public final CalculatorService calculatorService;
    private final CheckService checkService;

    public CalculatorServiceImplTest(){
        this.checkService = new CheckServiceImpl();
        this.calculatorService = new CalculatorServiceImpl(checkService);
    }


    @Test
    public void minusTest(){
        Assertions.assertEquals("5 - 3 = 2", calculatorService.minus(5, 3));
        Assertions.assertEquals("5 - -3 = 8", calculatorService.minus(5, -3));
    }

    @Test
    public void minusTestWithNullNum1(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.minus(null, 3));
    }

    @Test
    public void minusTestWithNullNum2(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.minus(5, null));
    }

    @Test
    public void minusTestWithNullBothParams(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.minus(null, null));
    }

    @Test
    public void plusTest(){
        Assertions.assertEquals("5 + -3 = 2", calculatorService.plus(5, -3));
        Assertions.assertEquals("5 + 3 = 8", calculatorService.plus(5, 3));
    }

    @Test
    public void plusTestWithNullNum1(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, 3));
    }

    @Test
    public void plusTestWithNullNum2(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(5, null));
    }

    @Test
    public void plusTestWithNullBothParams(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, null));
    }

    @Test
    public void multiplyTest(){
        Assertions.assertEquals("5 * -3 = -15", calculatorService.multiply(5, -3));
        Assertions.assertEquals("5 * 3 = 15", calculatorService.multiply(5, 3));
    }

    @Test
    public void multiplyTestWithNullNum1(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.multiply(null, 3));
    }

    @Test
    public void multiplyTestWithNullNum2(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.multiply(5, null));
    }

    @Test
    public void multiplyTestWithNullBothParams(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.multiply(null, null));
    }

    @Test
    public void divideTest(){
        Assertions.assertEquals("15 / -3 = -5", calculatorService.divide(15, -3));
        Assertions.assertEquals("15 / 3 = 5", calculatorService.divide(15, 3));
    }

    @Test
    public void divideByZeroTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(15, 0));
    }

    @Test
    public void divideTestWithNullNum1(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.divide(null, 3));
    }

    @Test
    public void divideTestWithNullNum2(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.divide(5, null));
    }

    @Test
    public void divideTestWithNullBothParams(){
        Assertions.assertThrows(InputErrorException.class, () -> calculatorService.divide(null, null));
    }

}
