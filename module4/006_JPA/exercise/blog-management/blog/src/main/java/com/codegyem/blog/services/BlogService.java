package com.codegyem.blog.services;

import com.codegyem.blog.model.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);
}
