package com.example.LibraryManagementSystem.model;

public class Book {
    private Long id;
    private String title;
    private String author;
    private boolean available;

    // Бос конструктор
    public Book() {}

    // Барлық параметрлері бар конструктор
    public Book(Long id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // Getter және Setter әдістері
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString() әдісі
    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author + "', available=" + available + "}";
    }
}
