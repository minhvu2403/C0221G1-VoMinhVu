package com.example.codegym.service;

import com.example.codegym.model.Smartphone;
import com.example.codegym.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {
    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public List<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(Integer id) {
        return smartphoneRepository.findById(id).orElse(null);
    }

    @Override
    public Smartphone save(Smartphone phone) {
        smartphoneRepository.save(phone);
        return phone;
    }

    @Override
    public Smartphone remove(Integer id) {
        Smartphone phone = findById(id);
        smartphoneRepository.deleteById(id);
        return phone;
    }
}
