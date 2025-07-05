package com.example.librarymanagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.librarymanagement.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        
        System.out.println("Testing with valid ISBN:");
        String validResult = bookService.getBookDetails("978-3-16-148410-0");
        System.out.println("Result: " + validResult);
        
        System.out.println("\nTesting with invalid ISBN:");
        String invalidResult = bookService.getBookDetails("000-0-00-000000-0");
        System.out.println("Result: " + invalidResult);
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
