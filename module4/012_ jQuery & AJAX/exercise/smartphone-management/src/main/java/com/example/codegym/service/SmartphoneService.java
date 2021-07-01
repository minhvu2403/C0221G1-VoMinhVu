package com.example.codegym.service;

import com.example.codegym.model.Smartphone;

import java.util.List;

public interface SmartphoneService {
    List<Smartphone> findAll();

    Smartphone findById(Integer id);

    Smartphone save(Smartphone phone);

    Smartphone remove(Integer id);
}
