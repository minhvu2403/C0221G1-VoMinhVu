package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.BorrowBookCard;
import com.example.book.model.Member;

import java.util.List;

public interface BorrowBookCardService {
    List<BorrowBookCard> findAll();

    void save(BorrowBookCard borrowBookCard, Book book, Member member);

    BorrowBookCard findById(Integer id);

    void update(BorrowBookCard borrowBookCard);
}
