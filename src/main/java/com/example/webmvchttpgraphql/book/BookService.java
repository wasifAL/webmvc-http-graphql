package com.example.webmvchttpgraphql.book;

import com.example.webmvchttpgraphql.author.Author;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class BookService {
    public Iterable<Book> getBooks(){
        return new Iterable<Book>() {
            @Override
            public Iterator<Book> iterator() {
                return null;
            }
        };
    }
    public Iterable<Book> getBooksByAuthor(Author author){
        return new Iterable<Book>() {
            @Override
            public Iterator<Book> iterator() {
                return null;
            }
        };
    }
    public Book getBookById(Long id){
        return new Book();
    }
}
