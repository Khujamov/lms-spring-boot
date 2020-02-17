package com.restgo.lms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "book",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "isbn")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true)
    private String isbn;

    @Column(name = "num_of_pages")
    @JsonProperty(value = "nop")
    private Integer numOfPages;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "author_book",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")}
    )
    private Set<Author> authors;

    public Book(String name, String isbn, Integer numOfPages, Publisher publisher) {
        this.name = name;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                isbn.equals(book.isbn);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, isbn);
    }
}
