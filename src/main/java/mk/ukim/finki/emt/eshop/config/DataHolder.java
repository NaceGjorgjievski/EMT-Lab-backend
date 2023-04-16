package mk.ukim.finki.emt.eshop.config;

import mk.ukim.finki.emt.eshop.model.Author;
import mk.ukim.finki.emt.eshop.model.Book;
import mk.ukim.finki.emt.eshop.model.Country;
import mk.ukim.finki.emt.eshop.model.enumerations.Category;
import mk.ukim.finki.emt.eshop.repository.AuthorRepository;
import mk.ukim.finki.emt.eshop.repository.BookRepository;
import mk.ukim.finki.emt.eshop.repository.CountryRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataHolder {

    private final CountryRepository countryRepository;
    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    public DataHolder(CountryRepository countryRepository, AuthorRepository authorRepository, BookRepository bookRepository) {
        this.countryRepository = countryRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void init(){
        Country country1 = new Country("Russia","Europe");
        Country country2 = new Country("Germany","Europe");
        Country country3 = new Country("England","Europe");
        Country country4 = new Country("China","Asia");
        Country country5 = new Country("India","Asia");

        Author author1 = new Author("Fyodor","Dostoyevsky",country1);
        Author author2 = new Author("Friedrich","Nietzsche",country2);
        Author author3 = new Author("George","Orwell",country3);
        Author author4 = new Author("Jiddu","Krishnamurti",country5);
        Author author5 = new Author("Arthur ","Clarke",country3);

        Book book1 = new Book("Space Odyssey", Category.FANTASY,author5,5);
        Book book2 = new Book("The Sentinel", Category.FANTASY,author5,5);
        Book book3 = new Book("Thus Spoke Zarathustra", Category.BIOGRAPHY,author2,5);
        Book book4 = new Book("Beyond Good and Evil", Category.BIOGRAPHY,author2,5);
        Book book5 = new Book("Animal Farm" ,Category.NOVEL,author3,5);
        Book book6 = new Book("Nineteen Eighty-Four", Category.NOVEL,author3,5);
        Book book7 = new Book("The Book of Life", Category.BIOGRAPHY,author4,5);
        Book book8 = new Book("Freedom from the Known", Category.BIOGRAPHY,author4,5);
        Book book9 = new Book("Crime and Punishment", Category.CLASSICS,author1,5);
        Book book10 = new Book("The Brothers Karamazov", Category.CLASSICS,author1,5);

        countryRepository.save(country1);
        countryRepository.save(country2);
        countryRepository.save(country3);
        countryRepository.save(country4);
        countryRepository.save(country5);

        authorRepository.save(author1);
        authorRepository.save(author2);
        authorRepository.save(author3);
        authorRepository.save(author4);
        authorRepository.save(author5);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
        bookRepository.save(book4);
        bookRepository.save(book5);
        bookRepository.save(book6);
        bookRepository.save(book7);
        bookRepository.save(book8);
        bookRepository.save(book9);
        bookRepository.save(book10);

    }


}
