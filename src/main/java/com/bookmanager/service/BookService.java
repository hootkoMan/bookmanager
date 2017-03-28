package com.bookmanager.service;

import com.bookmanager.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ruslan on 28.03.17.
 */
@Service
public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(Long id);

    Book getBookById(Long id);

    List<Book> listBook();
}
