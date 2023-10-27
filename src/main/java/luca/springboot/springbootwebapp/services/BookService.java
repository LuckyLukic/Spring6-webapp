package luca.springboot.springbootwebapp.services;

import luca.springboot.springbootwebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
