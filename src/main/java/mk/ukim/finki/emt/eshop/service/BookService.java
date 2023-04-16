package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Author;
import mk.ukim.finki.emt.eshop.model.Book;
import mk.ukim.finki.emt.eshop.model.Country;
import mk.ukim.finki.emt.eshop.model.dto.BookDto;
import mk.ukim.finki.emt.eshop.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {

   //Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies);
   Optional<Book> save(BookDto bookDto);
   //Optional<Book> edit (Long id,String name, Category category, Long authorId, Integer availableCopies);
   Optional<Book> edit (Long id, BookDto bookDto);
    void deleteById(Long id);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> markAsTaken(Long id);
}
