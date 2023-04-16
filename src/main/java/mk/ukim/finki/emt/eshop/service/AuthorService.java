package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Author;
import mk.ukim.finki.emt.eshop.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> save(String name, String surname, Country country);

    Optional<Author> edit(Long id, String name, String surname, Country country);

    void deleteById(Long id);

    List<Author> findAll();

    Optional<Author> findById(Long id);
}
