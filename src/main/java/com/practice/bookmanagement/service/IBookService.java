package com.practice.bookmanagement.service;

import com.practice.bookmanagement.dto.BookDto;
import com.practice.bookmanagement.model.Book;

import java.util.List;

public interface IBookService {
    Book addBook(BookDto book) throws Exception;
    List<Book> getAllBooks();

    Book findBookById(Integer bookId) throws Exception;

    Book updateBookStatus(Integer bookId) throws Exception;

    void deleteBook(Integer bookId) throws Exception;
}
