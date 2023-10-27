package luca.springboot.springbootwebapp.controller;

import luca.springboot.springbootwebapp.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @RequestMapping("/authors")
    public String getAuthor (Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
