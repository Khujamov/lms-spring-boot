package com.restgo.lms.dto;

import com.restgo.lms.entity.Publisher;
import lombok.Data;

import java.util.Set;

@Data
public class BookDTO {
    private int id;

    private String name;

    private String isbn;

    private int numOfPages;

    private Publisher publisher;

    private Set<AuthorDTO> authors;
}
