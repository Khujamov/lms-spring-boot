package com.restgo.lms.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class PublisherDTO {

    private int id;

    private String name;

    private LocalDate establishedDate;

    private Set<BookDTO> books;
}
