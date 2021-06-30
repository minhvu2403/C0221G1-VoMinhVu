package com.example.blog.service.impl;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return this.blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        if (findById(blog.getId())==null){
            blog.setAuthor("Admin");
            blog.setDate(new Date( new java.util.Date().getTime()));
        }
        this.blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
      this.blogRepository.deleteById(id);
    }
}
