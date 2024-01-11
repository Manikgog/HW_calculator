package com.homework.calculator.service;

import com.homework.calculator.exceptions.DivisionByZeroException;
import com.homework.calculator.exceptions.InputErrorException;
import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements CheckService {
    public void checkNumbers(Integer number1, Integer number2){
        if(number1 == null && number2 == null){
            throw new InputErrorException("Необходимо ввести значения num1 и num2.");
        }else if(number1 == null){
            throw new InputErrorException("Необходимо ввести значение num1.");
        }else if(number2 == null){
            throw new InputErrorException("Необходимо ввести значение num2.");
        }
    }

    public void checkingDivisionByZero(Integer number2){
        if(number2 == 0){
            throw new DivisionByZeroException("Деление на ноль запрещено.");
        }
    }
}
