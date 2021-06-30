package com.example.blog.service;

import com.example.blog.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(int id);

}