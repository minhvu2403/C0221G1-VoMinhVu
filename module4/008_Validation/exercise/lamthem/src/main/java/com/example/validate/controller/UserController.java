package com.example.validate.controller;

import com.example.validate.dto.UserDto;
import com.example.validate.model.User;
import com.example.validate.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
//    public ModelAndView checkValidation(@ModelAttribute @Valid User user, BindingResult bindingResult RedirectAttributes redis) {
//        if (bindingResult.hasFieldErrors()) {
//            ModelAndView modelAndView = new ModelAndView("index");
//            return modelAndView;
//        }
//        userService.save(user);
//        ModelAndView modelAndView = new ModelAndView("result", "user", user);
//        return modelAndView;
//    }
    public  String checkValidation(@ModelAttribute @Valid UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttribute, Model model){
        new UserDto().validate(userDto,bindingResult);

        if (bindingResult.hasErrors()){
            model.addAttribute("index");
        }
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        this.userService.save(user);
        return "redirect:/";
    }
}
