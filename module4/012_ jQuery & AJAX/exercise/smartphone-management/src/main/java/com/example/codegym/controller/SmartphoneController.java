package com.example.codegym.controller;

import com.example.codegym.model.Smartphone;
import com.example.codegym.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController

public class SmartphoneController {

    @Autowired
    private SmartphoneService smartphoneService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Smartphone> allPhones() {
        return smartphoneService.findAll();
    }

    @GetMapping("")
    public ModelAndView allPhonesPage() {
        ModelAndView modelAndView = new ModelAndView("/index");

        modelAndView.addObject("allphones", allPhones());
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public ModelAndView createSmartphonePage() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("sPhone", new Smartphone());
        return modelAndView;
    }

    @PostMapping (value = "/createNewPhone")
    @ResponseBody
    public Smartphone createSmartphone(@RequestBody Smartphone smartphone) {
        return smartphoneService.save(smartphone);
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editSmartphonePage(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        Smartphone smartphone = smartphoneService.findById(id);
        modelAndView.addObject("sPhone", smartphone);
        return modelAndView;
    }

    @PostMapping(value = "/edit/{id}")
    @ResponseBody
    public Smartphone editSmartphone(@PathVariable int id, @RequestBody Smartphone smartphone) {
        smartphone.setId(id);
        return smartphoneService.save(smartphone);
    }

    @PostMapping(value = "/delete/{id}")
    @ResponseBody
    public Smartphone deleteSmartphone(@PathVariable Integer id) {
        return smartphoneService.remove(id);
    }


}
