package com.subrutin.bookcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.subrutin.bookcatalog.form.BookForm;
import com.subrutin.bookcatalog.model.Book;
import com.subrutin.bookcatalog.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String findBookList(Model model){
        List<Book> books = bookService.findBookAll();
        model.addAttribute("books", books);
        return "book/book-list";
    }

    @GetMapping("/new")
    public String loadBookFoorm(Model model){
        model.addAttribute("bookForm", new BookForm());
        return "book/book-create";
    }

    @PostMapping("/new")
    public String addNewBook(@ModelAttribute BookForm bookForm, Model model){
        bookService.createNewBook(bookForm);
        return "redirect:/book/list";
    }
}
