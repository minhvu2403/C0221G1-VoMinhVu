package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "Xin chào");
        dictionary.put("goodbye", "Tạm biệt");
        dictionary.put("dictionary", "Từ điển");
        dictionary.put("computer", "Máy tính");
        dictionary.put("food", "Thức ăn");
        dictionary.put("sleep", "Ngủ");
    }

    @GetMapping("/")
    public String getFrom() {
        return "index";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String word, Model model) {
        String search= dictionary.get(word);
        model.addAttribute("search", search);
        return "result";
    }

}
