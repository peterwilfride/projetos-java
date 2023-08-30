package com.example.library.repository;

import com.example.library.entity.Book;
import com.example.library.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    //List<Book> listByCategory(Category category);
}
