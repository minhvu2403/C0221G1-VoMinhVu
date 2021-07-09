package com.example.codegym.service.impl;

import com.example.codegym.model.User;
import com.example.codegym.repository.UserRepository;
import com.example.codegym.service.UserService;
import com.example.codegym.util.DuplicateEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) throws DuplicateEmailException {
        try {
            userRepository.save(user);
        }catch (DataIntegrityViolationException e){
            throw new DuplicateEmailException();
        }
    }
}
