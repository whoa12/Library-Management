package com.practice.bookmanagement.service;

import com.practice.bookmanagement.dto.BookDto;
import com.practice.bookmanagement.model.Book;
import com.practice.bookmanagement.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService{
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(BookDto bookDto) throws Exception {
        Book newBook = new Book();
        if(bookRepository.existsById(bookDto.getId())){
            throw new Exception("Book with id " + bookDto.getId() + " already exists!" );
        }
        newBook.setId(bookDto.getId());
        newBook.setTitle(bookDto.getTitle());
        newBook.setAuthor(bookDto.getAuthor());
        newBook.setIsbn(bookDto.getIsbn());

        return bookRepository.save(newBook);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(Integer bookId) throws Exception {
        Optional<Book> opt =   bookRepository.findById(bookId);
        if(opt.isEmpty()){
            throw new Exception("Book not found with id: "+ bookId);
        }
        return opt.get();
    }

    @Override
    public Book updateBookStatus(Integer bookId) throws Exception {
        Book book = findBookById(bookId);

        book.setIsAvailable(!book.getIsAvailable());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer bookId) throws Exception {
        Book book = findBookById(bookId);

         bookRepository.deleteById(bookId);
    }
}
