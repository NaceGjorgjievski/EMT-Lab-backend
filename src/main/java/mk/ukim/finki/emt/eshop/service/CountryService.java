package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    Optional<Country> save(String name, String continent);

    Optional<Country> edit (Long id, String name, String continent);

    void deleteById(Long id);

    List<Country> findAll();

    Optional<Country> findById(Long id);
}
