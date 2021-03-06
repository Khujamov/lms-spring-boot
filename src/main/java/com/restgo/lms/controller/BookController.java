package com.restgo.lms.controller;

import com.restgo.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private final BookService service;

    // constructor-based injection
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/book")
    public String getBooks(Model model){
        model.addAttribute("books",service.getAll());
        System.out.println(service.getAll());
        return "books";
    }
}
