package luca.springboot.springbootwebapp.bootstrap;

import luca.springboot.springbootwebapp.domain.Author;
import luca.springboot.springbootwebapp.domain.Book;
import luca.springboot.springbootwebapp.domain.Publisher;
import luca.springboot.springbootwebapp.repositories.AuthorRepository;
import luca.springboot.springbootwebapp.repositories.BookRepository;
import luca.springboot.springbootwebapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublisherRepository publisherRepository;


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
        dmmt.setTitle("Don't Make Me Think");
        dmmt.setIsbn("525335");

        Author ariSaved = authorRepository.save(ari);
        Book dmmtSaved = bookRepository.save(dmmt);

        lucaSaved.getBooks().add(tagrSaved);
        ariSaved.getBooks().add(dmmtSaved);
        tagrSaved.getAuthors().add(lucaSaved);
        dmmtSaved.getAuthors().add(ariSaved);


        Publisher publisher = new Publisher();
        publisher.setPublisherName("MyPublisher");
        publisher.setAddress("123 Murri");
        Publisher savedPublisher = publisherRepository.save(publisher);

        tagrSaved.setPublisher(savedPublisher);
        dmmtSaved.setPublisher(savedPublisher);

        authorRepository.save(lucaSaved);
        authorRepository.save(ariSaved);
        bookRepository.save(tagrSaved);
        bookRepository.save(dmmtSaved);


        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count()  );
        System.out.println("Book Count: " + bookRepository.count()  );



        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
