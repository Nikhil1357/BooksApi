package com.nikhil.database.repositories;


import com.nikhil.database.TestDataUtil;
import com.nikhil.database.domain.entities.AuthorEntity;
import com.nikhil.database.domain.entities.BookEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)

public class BookEntityDaoImplIntegrationsTests {


    private BookRepository underTest;

    private AuthorRepository authorDao;


    @Autowired
    public BookEntityDaoImplIntegrationsTests(BookRepository underTest, AuthorRepository authorDao)
    {
        this.authorDao = authorDao;
        this.underTest = underTest;
    }
//
//
//    @Test
//    public void testThatBookCanBeCreatedAndRecalled() {
//
//        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
//        BookEntity bookEntity = TestDataUtil.createTestBookA(authorEntity);
//        underTest.save(bookEntity);
//        Optional<BookEntity> result = underTest.findById(bookEntity.getIsbn());
//
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(bookEntity);
//
//    }
//
//    @Test
//    public void testThatMultipleBookCanBeCreatedAndRecalled()
//    {
//        AuthorEntity authorEntityA = TestDataUtil.createTestAuthorA();
//        BookEntity bookEntityA = TestDataUtil.createTestBookA(authorEntityA);
//        underTest.save(bookEntityA);
//
//        AuthorEntity authorEntityB = TestDataUtil.createTestAuthorB();
//        BookEntity bookEntityB = TestDataUtil.createTestBookB(authorEntityB);
//        underTest.save(bookEntityB);
//
//        Iterable<BookEntity> result = underTest.findAll();
//        assertThat(result).hasSize(2).containsExactly(bookEntityA, bookEntityB);
//    }
////
//    @Test
//    public void testThatMultipleBookCanBeUpdated()
//    {
//        AuthorEntity authorEntityA = TestDataUtil.createTestAuthorA();
//        authorDao.save(authorEntityA);
//        BookEntity bookEntityA = TestDataUtil.createTestBookA(authorEntityA);
//        underTest.save(bookEntityA);
//        bookEntityA.setTitle("The Guide 2.0");
//        underTest.save(bookEntityA);
//        Optional<BookEntity> result = underTest.findById("ABC-123");
//
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(bookEntityA);
//
//    }
//    @Test
//    public void testThatBookCanBeDeleted()
//    {
//        AuthorEntity authorEntityA = TestDataUtil.createTestAuthorA();
//        BookEntity bookEntityA = TestDataUtil.createTestBookA(authorEntityA);
//        underTest.save(bookEntityA);
//        underTest.deleteById(bookEntityA.getIsbn());
//        Optional<BookEntity> result = underTest.findById(bookEntityA.getIsbn());
//        assertThat(result).isEmpty();
//    }

}