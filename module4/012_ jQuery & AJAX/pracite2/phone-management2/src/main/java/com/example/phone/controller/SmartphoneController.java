package com.example.phone.controller;


import com.example.phone.model.Smartphone;
import com.example.phone.service.ISmartphoneService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller

public class SmartphoneController {
    @Autowired
    ISmartphoneService smartphoneService;
    @GetMapping("/")
    public ModelAndView getListHome(){
        return new ModelAndView("/home","phones",smartphoneService.findAll());
    }
    @GetMapping("/create")
    public String showListPhone(){
        return "/create";
    }
    @PostMapping("/create")
    @ResponseBody
    public Smartphone createSmartphone(@RequestBody Smartphone smartphone) {
        System.out.println(smartphone.toString());
        return smartphoneService.save(smartphone);
    }
      @PostMapping("/delete/{id}")
      @ResponseBody
    public Smartphone showDeletePhone(@PathVariable Long id){
        this.smartphoneService.remove(id);
        return this.smartphoneService.findById(id).orElse(null);
      }
      @GetMapping("edit/{id}")
    public ModelAndView showEditPage(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/edit");
        Optional<Smartphone> smartphone=this.smartphoneService.findById(id);
        modelAndView.addObject("phone",smartphone);
        return modelAndView;
//        return  new ModelAndView("/edit","phone", this.smartphoneService.findById(id));
      }
}
