package com.example.library.service;

import com.example.library.entity.Author;
import com.example.library.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    // list all authors
    public List<Author> listAll() {
        return repository.findAll();
    }

    // register new author
    public Author create(Author newAuthor) {
        return repository.save(newAuthor);
    }

    // find an author by id
    public Author findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    // update an author by id
    public Author update(Long id, Author newAuthor) {
        Author author = findById(id);
        author.setName(newAuthor.getName());
        author.setBirthDate(newAuthor.getBirthDate());
        return repository.save(author);
    }

    // remove an author by id
    public void remove(Long id) {
        Author author = findById(id);
        repository.delete(author);
    }
}
