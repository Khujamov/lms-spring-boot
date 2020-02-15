package com.restgo.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "established_date")
    private LocalDate establishedDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher")
    private List<Book> books;

    public Publisher(String name, LocalDate establishedDate) {
        this.name = name;
        this.establishedDate = establishedDate;
    }
}
