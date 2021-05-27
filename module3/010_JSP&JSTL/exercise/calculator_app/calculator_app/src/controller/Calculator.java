package controller;

public class Calculator {
    public static double calculate(double firstOperand, double secondOperand, String operator){
        float result =0;
        switch (operator){
            case "+":
                return firstOperand +secondOperand;
            case "-":
                return firstOperand-secondOperand;
            case "*":
                return firstOperand *secondOperand;
            case "/":
                if (secondOperand !=0){
                    return firstOperand/secondOperand;
                }
                else
                    throw  new ArithmeticException();
        }
        return result;
    }
}
