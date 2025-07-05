package com.example.librarymanagement.service;
import com.example.librarymanagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    
    public BookRepository getBookRepository() {
        return this.bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Dependency injection: Setting BookRepository");
        this.bookRepository = bookRepository;
    }

    public String getBookDetails(String isbn) {
        return bookRepository.getBookInfo(isbn);
    }
}


