package com.example.codegym.service;

import com.example.codegym.model.User;
import com.example.codegym.util.DuplicateEmailException;

public interface UserService {
    void save(User user) throws DuplicateEmailException;
}