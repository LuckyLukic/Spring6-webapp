package luca.springboot.springbootwebapp.repositories;

import luca.springboot.springbootwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
