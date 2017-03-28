package com.bookmanager.controller;

import com.bookmanager.model.Book;
import com.bookmanager.service.BookService;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ruslan on 28.03.17.
 */
@Controller
public class BookController {
    @Setter
    private BookService bookService;

    @RequestMapping(value = "books", method = RequestMethod.PUT)
    public String listBooks(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("listBook", bookService.listBook());

        return "books";
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") Book book) {
        if (book.getId() == 0) {
            bookService.addBook(book);
        } else {
            bookService.updateBook(book);
        }

        return "redirect:/books";
    }

    @RequestMapping(value = "/remove/{id}"/*, method = RequestMethod.DELETE*/)
    public String removeBook(@PathVariable("id") Long id) {
        bookService.removeBook(id);

        return "redirect:/books";
    }

    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        model.addAttribute("listBook", bookService.listBook());
        return "books";
    }

    @RequestMapping("bookdata/{id}")
    public String bookData(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));

        return "bookdata";
    }
}
