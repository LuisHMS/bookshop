package com.example.demo.interfaces;

import com.example.demo.entity.Book;

import java.util.ArrayList;

public interface BookInterface {

    ArrayList<Book> getBookList();

    String registerBook(Book book);

}
