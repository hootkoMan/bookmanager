package com.bookmanager.dao;

import com.bookmanager.model.Book;

import java.util.List;

/**
 * Created by ruslan on 28.03.17.
 */
public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(Long id);

    Book getBookById(Long id);

    List<Book> listBook();
}
