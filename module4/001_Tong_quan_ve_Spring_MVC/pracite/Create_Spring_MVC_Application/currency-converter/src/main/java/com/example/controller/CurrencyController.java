package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @GetMapping("/")
    public String getFrom() {
        return "index";
    }
   @GetMapping("/convert")
    public String Convent(@RequestParam int rate, @RequestParam int usd, Model model) {
        int vnd = usd * rate;
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "index";
    }

}
