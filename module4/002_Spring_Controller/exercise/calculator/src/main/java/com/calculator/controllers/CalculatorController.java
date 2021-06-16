package com.calculator.controllers;

import com.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("/")
    public String getCalculator() {
        return "index";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam String firstOperand, @RequestParam String secondOperand, @RequestParam String operator, Model model) {
        double a = Double.parseDouble(firstOperand);
        double b = Double.parseDouble(secondOperand);
        try {
            model.addAttribute("operator", calculatorService.Calculate(a, b, operator));

        } catch (ArithmeticException e) {
            model.addAttribute("total", e.getMessage());
        }
        return "index";
    }

}
