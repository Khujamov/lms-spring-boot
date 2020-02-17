package com.restgo.lms.dto;

import lombok.Data;

import java.util.Set;

@Data
public class AuthorDTO {
    private int id;

    private String fullName;

    private Set<BookDTO> books;
}
