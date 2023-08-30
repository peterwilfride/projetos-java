package com.example.library.service;

import com.example.library.entity.Book;
import com.example.library.entity.SortBookByName;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // list all books
    public List<Book> listAll() {
        return repository.findAll();
    }

    // list by author id
    public List<Book> listByAuthor(Long id) {
        return  repository.findAll()
                .stream()
                .filter(book -> Objects.equals(book.getAuthor().getId(), id))
                .toList();
    }

    public List<Book> listSorted() {
        List<Book> ll = repository.findAll();
        ll.sort(new SortBookByName());
        return ll;
    }

    public List<Book> listByCategory(String category) {
        return repository.findAll()
                .stream()
                .filter(book -> Objects.equals(book.getCategory().toString(), category))
                .toList();
    }

    // register new book
    public Book create(Book newBook) {
        return repository.save(newBook);
    }

    // find a book by id
    public Book findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    // update a book by id
    public Book update(Long id, Book newBook) {
        Book book = findById(id);
        book.setTitle(newBook.getTitle());
        book.setIsbn13(newBook.getIsbn13());
        return repository.save(book);
    }

    // remove a book by id
    public void remove(Long id) {
        Book book = findById(id);
        repository.delete(book);
    }
}
