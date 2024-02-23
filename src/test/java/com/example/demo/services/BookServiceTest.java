package com.example.demo.services;

import com.example.demo.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(bookService, "okMessage", "satisfactorily registered book");
    }

    @Test
    void registerBookTest(){
        String okMessage = "satisfactorily registered book";
        Book book = new Book();
        book.setTitle("Title");
        book.setAuthor("Author");
        book.setYearOfPublication("Year");
        book.setGenre("Genre");

        String response = bookService.registerBook(book);

        assertEquals(response, okMessage);
    }

    @Test
    void getBooksVoidTest(){
        ArrayList<Book> result = bookService.getBookList();

        assertEquals(0, result.size());
    }

    @Test
    void getBooksTest(){
        registerBookTest();

        ArrayList<Book> result = bookService.getBookList();

        assertEquals(1, result.size());
    }
}
