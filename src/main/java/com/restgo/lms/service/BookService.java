package com.restgo.lms.service;

import com.restgo.lms.entity.Book;
import com.restgo.lms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> getAll(){
        return repository.findAll();
    }
}
