package com.nikhil.database.controller;


import com.nikhil.database.domain.dto.AuthorDto;
import com.nikhil.database.domain.dto.BookDto;
import com.nikhil.database.domain.entities.AuthorEntity;
import com.nikhil.database.domain.entities.BookEntity;
import com.nikhil.database.mappers.Impl.BookMapper;
import com.nikhil.database.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class BookController {


    private BookService bookService;
    private BookMapper bookMapper;

    public BookController(BookMapper bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity<BookDto> createBook(@PathVariable("isbn") String isbn, @RequestBody BookDto bookDto) {

        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        boolean exists = bookService.isExists(isbn);
        BookEntity bookTemp = bookService.save(isbn, bookEntity);

        if(exists){
            return new ResponseEntity<>(bookMapper.mapTo(bookTemp), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(bookMapper.mapTo(bookTemp), HttpStatus.CREATED);
        }
    }


    @PatchMapping("/books/{isbn}")
    public ResponseEntity<BookDto> partialUpdateBook(
            @PathVariable("isbn") String isbn,
            @RequestBody BookDto bookDto)
    {
        boolean exists = bookService.isExists(isbn);
        if(!exists){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        BookEntity bookTemp = bookService.partialUpdate(isbn, bookEntity);
        return new ResponseEntity<>(bookMapper.mapTo(bookTemp), HttpStatus.OK);

    }

    @GetMapping(path = "/nonpagebooks")
    public List<BookDto> getBooks()
    {
        List<BookEntity> books  = bookService.findAll();
        return books.stream()
                .map(book -> bookMapper.mapTo(book))
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/books")
    public Page<BookDto> listPagedBooks(Pageable pageable)
    {
        Page<BookEntity> books  = bookService.findAll(pageable);
        return books.map(bookMapper::mapTo);

    }

    @GetMapping(path = "/books/{isbn}")
    public ResponseEntity<BookDto> getAuthor(@PathVariable("isbn") String isbn)
    {
        Optional<BookEntity> book  = bookService.findOne(isbn);
        return book.map(bookEntity -> {
            BookDto bookDto = bookMapper.mapTo(bookEntity);
            return new ResponseEntity<>(bookDto, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping(path = "/books/{isbn}")
    public ResponseEntity<AuthorDto> deleteAuthor(@PathVariable("isbn") String isbn)
    {
        bookService.deleteBook(isbn);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
