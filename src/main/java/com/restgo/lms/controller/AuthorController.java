package com.restgo.lms.controller;

import com.restgo.lms.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService service;

    @GetMapping("/author")
    public String getAuthors(Model model){
        model.addAttribute("authors",service.getAll());
        return "authors";
    }
}
