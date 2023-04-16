package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.User;
import mk.ukim.finki.emt.eshop.model.enumerations.Role;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {

    Optional<User> register(String username, String password, String repeatPassword, String name, String surname, Role role);
}
