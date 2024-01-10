package com.homework.calculator.service;

import com.homework.calculator.exceptions.DivisionByZeroException;
import com.homework.calculator.exceptions.InputErrorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParametrizedTest {

    private final CalculatorService calculatorService;
    private final CheckService checkService;

    public CalculatorServiceImplParametrizedTest(){
        this.checkService = new CheckServiceImpl();
        this.calculatorService = new CalculatorServiceImpl(checkService);
    }
    public static Stream<Arguments> provideParamsForPlusMethodTests(){
        return Stream.of(
                Arguments.of(5, 3, 8),
                Arguments.of(5, 6, 11),
                Arguments.of(null, 3, null),
                Arguments.of(5, null, null),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusMethodTests")
    public void testPlus(Integer num1, Integer num2, Integer expectedResult){
        if(num1 == null && num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, null));
        }else if(num1 == null) {
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, num2));
        }else if(num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(num1, null));
        }else{
            Integer actualResult = calculatorService.plus(num1, num2);
            Assertions.assertEquals(expectedResult, actualResult);
        }

    }

    public static Stream<Arguments> provideParamsForMinusMethodTests(){
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(5, 6, -1),
                Arguments.of(null, 3, null),
                Arguments.of(5, null, null),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusMethodTests")
    public void testMinus(Integer num1, Integer num2, Integer expectedResult){
        if(num1 == null && num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, null));
        }else if(num1 == null) {
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, num2));
        }else if(num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(num1, null));
        }else{
            Integer actualResult = calculatorService.minus(num1, num2);
            Assertions.assertEquals(expectedResult, actualResult);
        }

    }

    public static Stream<Arguments> provideParamsForMultiplyMethodTests(){
        return Stream.of(
                Arguments.of(5, 3, 15),
                Arguments.of(5, -6, -30),
                Arguments.of(null, 3, null),
                Arguments.of(5, null, null),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyMethodTests")
    public void testMultiply(Integer num1, Integer num2, Integer expectedResult){
        if(num1 == null && num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, null));
        }else if(num1 == null) {
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, num2));
        }else if(num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(num1, null));
        }else{
            Integer actualResult = calculatorService.multiply(num1, num2);
            Assertions.assertEquals(expectedResult, actualResult);
        }

    }

    public static Stream<Arguments> provideParamsForDivideMethodTests(){
        return Stream.of(
                Arguments.of(15, 3, 5),
                Arguments.of(15, -5, -3),
                Arguments.of(2, 0, 0),
                Arguments.of(null, 3, null),
                Arguments.of(5, null, null),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideMethodTests")
    public void testDivide(Integer num1, Integer num2, Integer expectedResult){
        if(num1 == null && num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, null));
        }else if(num1 == null) {
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(null, num2));
        }else if(num2 == null){
            Assertions.assertThrows(InputErrorException.class, () -> calculatorService.plus(num1, null));
        }else{
            if(num2 != 0) {
                Integer actualResult = calculatorService.divide(num1, num2);
                Assertions.assertEquals(expectedResult, actualResult);
            }else{
                Assertions.assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(num1, null));
            }
        }

    }
}
