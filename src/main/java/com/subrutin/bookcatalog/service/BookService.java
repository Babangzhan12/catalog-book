package com.subrutin.bookcatalog.service;

import java.util.List;

import com.subrutin.bookcatalog.form.BookForm;
import com.subrutin.bookcatalog.model.Book;

public interface BookService {

    public List<Book> findBookAll();

    public void createNewBook(BookForm bookForm);
}
