package com.restgo.lms.controller;

import com.restgo.lms.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublisherController {

    private final PublisherService service;

    public PublisherController(PublisherService service) {
        this.service = service;
    }

    @GetMapping("/publisher")
    public String getPublishers(Model model){
        model.addAttribute("publishers",service.getAll());
        return "publishers";
    }
}
