package luca.springboot.springbootwebapp.bootstrap;

import luca.springboot.springbootwebapp.domain.Author;
import luca.springboot.springbootwebapp.domain.Book;
import luca.springboot.springbootwebapp.repositories.AuthorRepository;
import luca.springboot.springbootwebapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;


    @Override
    public void run(String... args) throws Exception {

        Author luca = new Author();
        luca.setFirstName("Luca");
        luca.setLastName("Iannice");
        
        Book tagr = new Book();
        tagr.setTitle("Think And Grow Rich");
        tagr.setIsbn("123456");
        
        Author lucaSaved = authorRepository.save(luca);
        Book tagrSaved = bookRepository.save(tagr);

        Author ari = new Author();
        ari.setFirstName("Ari");
        ari.setLastName("Ki");

        Book dmmt = new Book();
        tagr.setTitle("Don't Make Me Think");
        tagr.setIsbn("525335");

        Author ariSaved = authorRepository.save(ari);
        Book dmmtSaved = bookRepository.save(dmmt);

        lucaSaved.getBooks().add(tagrSaved);
        ariSaved.getBooks().add(dmmtSaved);

        authorRepository.save(lucaSaved);
        authorRepository.save(ariSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count()  );
        System.out.println("Book Count: " + bookRepository.count()  );


    }
}
