package com.example.demo.services;

import com.example.demo.entity.Book;
import com.example.demo.interfaces.BookInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class BookService implements BookInterface {
    @Value("${ok.message}")
    String okMessage;
    ArrayList<Book> books = new ArrayList<>();
    @Override
    public ArrayList<Book> getBookList() {
        return books;
    }

    @Override
    public String registerBook(Book book) {
        books.add(book);
        return okMessage;
    }
}
