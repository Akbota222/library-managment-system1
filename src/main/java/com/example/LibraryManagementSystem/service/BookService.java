package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final List<Book> bookList = new ArrayList<>();

    // Барлық кітаптарды алу
    public List<Book> getAllBooks() {
        return bookList;
    }

    // Жаңа кітап қосу
    public void addBook(Book book) {
        bookList.add(book);
    }

    // ID бойынша кітапты табу
    public Optional<Book> getBookById(Long id) {
        return bookList.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    // Кітапты жою
    public boolean removeBook(Long id) {
        return bookList.removeIf(book -> book.getId().equals(id));
    }
}
