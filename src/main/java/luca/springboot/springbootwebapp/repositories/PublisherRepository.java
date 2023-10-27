package luca.springboot.springbootwebapp.repositories;

import luca.springboot.springbootwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long>{
}
