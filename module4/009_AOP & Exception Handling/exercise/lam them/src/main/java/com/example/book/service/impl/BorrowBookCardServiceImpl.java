package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.model.BorrowBookCard;
import com.example.book.model.Member;
import com.example.book.repository.BorrowBookCardRepository;
import com.example.book.service.BookService;
import com.example.book.service.BorrowBookCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BorrowBookCardServiceImpl implements BorrowBookCardService {

    @Autowired
    BorrowBookCardRepository borrowBookCardRepository;

    @Autowired
    BookService bookService;

    @Override
    public List<BorrowBookCard> findAll() {
        return borrowBookCardRepository.findAll();
    }

    @Override
    public void save(BorrowBookCard borrowBookCard, Book book, Member member) {
        borrowBookCard.setDayStartBorrow(LocalDate.now().toString());
        borrowBookCard.setMember(member);
        borrowBookCard.setBook(book);

        book.setAmount(book.getAmount() - 1);
        bookService.save(book);
        borrowBookCardRepository.save(borrowBookCard);

    }

    @Override
    public BorrowBookCard findById(Integer id) {
        return borrowBookCardRepository.findById(id).orElse(null);
    }

    @Override
    public void update(BorrowBookCard borrowBookCard) {
        borrowBookCard.setStatus(true);
        borrowBookCard.setDayEndBorrow(LocalDate.now().toString());
        borrowBookCardRepository.save(borrowBookCard);

        Book book = borrowBookCard.getBook();
        book.setAmount(book.getAmount() + 1);
        bookService.save(book);
    }
}