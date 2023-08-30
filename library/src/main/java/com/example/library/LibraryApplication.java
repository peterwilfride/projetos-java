package com.example.library;

import com.example.library.entity.Author;
import com.example.library.entity.Book;
import com.example.library.entity.Category;
import com.example.library.service.AuthorService;
import com.example.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) throws ParseException {
        ConfigurableApplicationContext ctx = SpringApplication.run(LibraryApplication.class, args);

        BookService bs = ctx.getBean(BookService.class);
        AuthorService as = ctx.getBean(AuthorService.class);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Author author1 = new Author();
        author1.setName("J. R. R. Tolkien");
        author1.setBirthDate(sd.parse("03/01/1892"));
        as.create(author1);

        Author author2 = new Author();
        author2.setName("Agatha Christie");
        author2.setBirthDate(sd.parse("15/09/1890"));
        as.create(author2);

        Book book1 = new Book();
        book1.setTitle("O Senhor dos Anéis: O retorno do rei");
        book1.setIsbn13("978-8595084773");
        book1.setAuthor(author1);
        book1.setCategory(Category.FANTASY);
        bs.create(book1);

        Book book2 = new Book();
        book2.setTitle("O Senhor dos Anéis: A Sociedade do Anel");
        book2.setIsbn13("978-8595084759");
        book2.setAuthor(author1);
        book2.setCategory(Category.FANTASY);
        bs.create(book2);

        Book book3 = new Book();
        book3.setTitle("Murder on the Orient Express");
        book3.setIsbn13("978-0573707735 ");
        book3.setAuthor(author2);
        book3.setCategory(Category.CRIME);
        bs.create(book3);

        List<Book> booksFromTolkien = bs.listByAuthor(2L);
        booksFromTolkien.stream().forEach(book -> System.out.println(book.getTitle()));

        System.out.println("--------------------");

        bs.listSorted().forEach(book -> System.out.println(book.getTitle()));

        System.out.println("--------------------");

        bs.remove(1L);
        bs.listByCategory("FANTASY").forEach(book -> System.out.println(book.getTitle()));
    }
}
