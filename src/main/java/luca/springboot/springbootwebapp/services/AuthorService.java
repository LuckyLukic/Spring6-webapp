package luca.springboot.springbootwebapp.services;

import luca.springboot.springbootwebapp.domain.Author;
import org.springframework.stereotype.Service;


public interface AuthorService {

    Iterable<Author> findAll();
}
