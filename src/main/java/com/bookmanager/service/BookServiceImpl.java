package com.bookmanager.service;

import com.bookmanager.dao.BookDao;
import com.bookmanager.model.Book;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ruslan on 28.03.17.
 */
public class BookServiceImpl implements BookService {
    @Setter
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listBook() {
        return bookDao.listBook();
    }
}
