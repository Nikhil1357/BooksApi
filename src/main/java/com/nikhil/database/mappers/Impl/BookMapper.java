package com.nikhil.database.mappers.Impl;

import com.nikhil.database.domain.dto.BookDto;
import com.nikhil.database.domain.entities.BookEntity;
import com.nikhil.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.awt.print.Book;


@Component
public class BookMapper implements Mapper<BookEntity,  BookDto > {

    private final ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity bookEntity) {
        return modelMapper.map(bookEntity, BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
