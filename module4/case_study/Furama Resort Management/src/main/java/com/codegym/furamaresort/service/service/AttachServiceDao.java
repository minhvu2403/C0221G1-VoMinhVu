package com.codegym.furamaresort.service.service;

import com.codegym.furamaresort.model.service.AttachService;

import java.util.List;

public interface AttachServiceDao {
    AttachService findById(Long idAttachService);

    List<AttachService> findAll();

    void save(AttachService attachService);
}
