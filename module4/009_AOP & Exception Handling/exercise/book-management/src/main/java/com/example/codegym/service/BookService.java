package com.example.codegym.service;

import com.example.codegym.model.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    void deleteById(Integer id);
    Book findById(Integer id);
    List<Book> findAll();
}