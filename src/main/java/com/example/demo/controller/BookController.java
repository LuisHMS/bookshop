package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.interfaces.BookInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookshop")
@RequiredArgsConstructor
public class BookController {

    private final BookInterface bookInterface;

    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return bookInterface.getBookList();
    }

    @PostMapping("/registerBook")
    public String registerBook(@RequestBody Book book){
        return bookInterface.registerBook(book);
    }

}
