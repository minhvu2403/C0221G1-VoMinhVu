package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ModelAndView showForm(){
        return new ModelAndView("index","user",new User());
    }
    @PostMapping("/validate")
    public ModelAndView checkValidation(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("result", "user", user);
        return modelAndView;
    }
}
