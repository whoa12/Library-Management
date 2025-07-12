package com.practice.bookmanagement.controller;

import com.practice.bookmanagement.dto.BookDto;
import com.practice.bookmanagement.model.Book;
import com.practice.bookmanagement.response.DeleteMessage;
import com.practice.bookmanagement.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }


    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@Valid @RequestBody BookDto bookDto) throws Exception {
        Book book = bookService.addBook(bookDto);

        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer bookId) throws Exception {
        Book book = bookService.findBookById(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PutMapping("/{bookId}/update")
    public ResponseEntity<Book> updateStatusOfBook(@PathVariable Integer bookId) throws Exception {
        Book book = bookService.updateBookStatus(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @DeleteMapping("/{bookId}/delete")
    public ResponseEntity<DeleteMessage> deleteBookById(@PathVariable Integer bookId) throws Exception {
        bookService.deleteBook(bookId);
        DeleteMessage res = new DeleteMessage();
        res.setMessage("Book deleted successfully!");
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
