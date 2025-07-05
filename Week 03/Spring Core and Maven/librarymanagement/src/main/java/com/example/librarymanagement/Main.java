package com.example.librarymanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.librarymanagement.service.BookService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing Spring context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        System.out.println("Getting BookService bean...");
        BookService bookService = context.getBean("bookService", BookService.class);
        
        System.out.println("Testing book service...");
        String bookDetails = bookService.getBookDetails("978-3-16-148410-0");
        System.out.println(bookDetails);
        
        if (bookService.getBookRepository() != null) {
            System.out.println("Dependency injection successful!");
        } else {
            System.out.println("Dependency injection failed!");
        }
        
        ((ClassPathXmlApplicationContext) context).close();
    }

}