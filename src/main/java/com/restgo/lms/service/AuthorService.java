package com.restgo.lms.service;

import com.restgo.lms.entity.Author;
import com.restgo.lms.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public List<Author> getAll(){
        return repository.findAll();
    }
}
