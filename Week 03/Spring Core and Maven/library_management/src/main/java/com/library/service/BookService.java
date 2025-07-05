package com.library.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;
    private String libraryName;

    public BookService(@Value("Central Library") String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Constructor Injection: Library name = " + libraryName);
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Adding book to " + libraryName + ": " + bookName);
        bookRepository.saveBook(bookName);
    }
}
