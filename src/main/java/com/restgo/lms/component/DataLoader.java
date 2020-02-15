package com.restgo.lms.component;

import com.restgo.lms.entity.Author;
import com.restgo.lms.entity.Book;
import com.restgo.lms.entity.Publisher;
import com.restgo.lms.repository.AuthorRepository;
import com.restgo.lms.repository.BookRepository;
import com.restgo.lms.repository.PublisherRepository;
import com.restgo.lms.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;



    @Override
    public void run(String... args) throws Exception {
//        LocalDate now = LocalDate.of(1998, 2, 25);
//        authorRepository.save(new Author("John","Doe"));
//        publisherRepository.save(new Publisher("New York Times",now));
//        bookRepository.save(new Book(  "Calculus",
//                                        "99-98-98",
//                                        120,
//                                        publisherRepository.findById(1).get()
//                                        ));
//        Book book = bookRepository.findById(1).get();
//        book.setAuthors(authorRepository.findAll().stream().collect(Collectors.toSet()));
//        bookRepository.save(book);
        System.out.println("Run");
    }
}
