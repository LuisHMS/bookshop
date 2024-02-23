package com.example.demo.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Book {
    String id = UUID.randomUUID().toString();
    String title;
    String author;
    String yearOfPublication;
    String genre;
}
