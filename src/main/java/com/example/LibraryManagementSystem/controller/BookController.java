package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.model.Book;
import com.example.LibraryManagementSystem.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Барлық кітаптарды алу
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Жаңа кітап қосу
    @PostMapping
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Кітап қосылды: " + book.getTitle();
    }

    // ID бойынша кітапты табу
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // ID бойынша кітапты жою
    @DeleteMapping("/{id}")
    public String removeBook(@PathVariable Long id) {
        boolean removed = bookService.removeBook(id);
        return removed ? "Кітап жойылды" : "Кітап табылмады";
    }
}
