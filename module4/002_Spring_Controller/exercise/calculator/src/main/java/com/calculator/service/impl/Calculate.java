package com.calculator.service.impl;

import com.calculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class Calculate implements ICalculatorService {
    @Override
    public double Calculate(double a, double b, String operator) {
        double total = 0;
        switch (operator) {
            case "Addition":
                total = a + b;
                break;
            case "Subtraction":
                total = a - b;
                break;
            case "Multiplication":
                total = a * b;
                break;
            case "Division":
                if (b != 0) {
                    total = a / b;
                } else {
                    throw new ArithmeticException("Error divide by 0");

                }
                break;

        }
        return total;

    }
}
