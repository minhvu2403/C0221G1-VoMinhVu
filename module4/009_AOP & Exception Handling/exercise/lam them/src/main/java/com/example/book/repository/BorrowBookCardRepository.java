package com.example.book.repository;


import com.example.book.model.BorrowBookCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookCardRepository extends JpaRepository<BorrowBookCard, Integer> {
}
