package com.example.phone.service.impl;

import com.example.phone.model.Smartphone;
import com.example.phone.repository.ISmartphoneRepository;
import com.example.phone.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    ISmartphoneRepository iSmartphoneRepository;
    @Override
    public Iterable<Smartphone> findAll() {
        return iSmartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return this.iSmartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return this.iSmartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
      this.iSmartphoneRepository.deleteById(id);
    }
}
