package com.restgo.lms.controller;

import com.restgo.lms.mapper.AuthorMapper;
import com.restgo.lms.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    private final AuthorService service;

    private final AuthorMapper authorMapper;

    public AuthorController(AuthorService service, AuthorMapper authorMapper) {
        this.service = service;
        this.authorMapper = authorMapper;
    }

    @GetMapping("/author")
    public String getAuthors(Model model){
        model.addAttribute("authors",service.getAll());
        return "authors";
    }
}
