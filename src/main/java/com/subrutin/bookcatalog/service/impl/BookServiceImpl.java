package com.subrutin.bookcatalog.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.subrutin.bookcatalog.form.BookForm;
import com.subrutin.bookcatalog.model.Book;
import com.subrutin.bookcatalog.service.BookService;

@Service
public class BookServiceImpl implements BookService{

    List<Book> books = new ArrayList<>();
    public BookServiceImpl(){
        super();
        Book book1 = new Book();
        book1.setId("1");
        book1.setTitle("Sherlock Holmes : A Study to Scarlet");
        book1.setAuthor("Sir Arthur Conan Doyle");
        book1.setDescription("Our first meeting with Sherlock Holmes. And John Watson's too! The young doctor is astonished by Holmes' many idiosyncrasies, including his talents on the violin.");
        Book book2 = new Book();
        book2.setId("2");
        book2.setTitle("Arsène Lupin, Gentleman-Thief");
        book2.setAuthor("Maurice Leblanc");
        book2.setDescription("The suave adventures of a gentleman rogue—a French Thomas Crown Created by Maurice LeBlanc during the early twentieth century, Arsene Lupin is a witty confidence man and burglar, the Sherlock Holmes of crime. The poor and innocent have nothing to fear from him; often they profit from his spontaneous generosity. The rich and powerful, and the detective who tries to spoil his fun, however, must beware. They are the target of Arsene’s mischief and tomfoolery. A masterful thief, his plans frequently evolve into elaborate capers, a precursor to such cinematic creations as Ocean’s Eleven and The Sting. Sparkling with amusing banter, these stories—the best of the Lupin series—are outrageous, melodramatic, and literate.\r\n");
        books.add(book1);
        books.add(book2);
    }


    @Override
    public List<Book> findBookAll() {
        return books;
    }

    @Override
    public void createNewBook(BookForm bookForm) {
        Book book = new Book();
        book.setTitle(bookForm.getTitle());
        book.setAuthor(bookForm.getAuthor());
        book.setDescription(bookForm.getDescription());
        book.setId(UUID.randomUUID().toString());
        books.add(book);
    }    
}
