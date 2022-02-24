package com.example.webmvchttpgraphql.book;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Date publishDate;
    private Long authorId;
}
