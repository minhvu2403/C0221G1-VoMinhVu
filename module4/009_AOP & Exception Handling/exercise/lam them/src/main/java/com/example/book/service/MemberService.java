package com.example.book.service;

import com.example.book.model.Member;

import java.util.List;

public interface MemberService {
    List<Member> findALl();

    Member findById(Integer id);
}
