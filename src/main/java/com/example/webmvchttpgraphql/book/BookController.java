package com.example.webmvchttpgraphql.book;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class BookController {
    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @QueryMapping
    public Iterable<Book> books(){
        return this.service.getBooks();
    }

    @MutationMapping
    public void create(@Argument("input") Book book) {

//        this.salaryService.updateSalary(employeeId, salary);
    }

    @MutationMapping
    public void update(@Argument("input") Book book) {

//        this.salaryService.updateSalary(employeeId, salary);
    }
}
