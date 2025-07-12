package com.practice.bookmanagement.repository;

import com.practice.bookmanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
