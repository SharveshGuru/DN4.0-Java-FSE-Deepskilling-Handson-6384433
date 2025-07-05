package com.library.Library_Management.repository;
import com.library.Library_Management.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
