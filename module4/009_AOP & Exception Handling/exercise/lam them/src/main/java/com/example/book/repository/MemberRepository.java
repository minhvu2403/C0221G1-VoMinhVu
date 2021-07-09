package com.example.book.repository;

import com.example.book.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member,Integer> {
}
