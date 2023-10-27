package luca.springboot.springbootwebapp.repositories;

import luca.springboot.springbootwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
