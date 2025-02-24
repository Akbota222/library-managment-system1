package com.example.LibraryManagementSystem.model;

public class LibraryMember {
    private Long id;
    private String name;
    private String email;

    // Бос конструктор
    public LibraryMember() {}

    // Барлық параметрлері бар конструктор
    public LibraryMember(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter және Setter әдістері
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() әдісі
    @Override
    public String toString() {
        return "LibraryMember{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
