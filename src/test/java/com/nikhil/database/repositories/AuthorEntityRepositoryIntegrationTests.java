package com.nikhil.database.repositories;


import com.nikhil.database.TestDataUtil;
import com.nikhil.database.domain.entities.AuthorEntity;
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
public class AuthorEntityRepositoryIntegrationTests {

    private AuthorRepository underTest;

    @Autowired
    public AuthorEntityRepositoryIntegrationTests(AuthorRepository underTest) {
        this.underTest = underTest;
    }

//    @Test
//    public void testThatAuthorCanBeCreatedAndRecalled() {
//        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
//        underTest.save(authorEntity);
//        Optional<AuthorEntity> result = underTest.findById(authorEntity.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(authorEntity);
//    }
//    @Test
//    public void testThatMultipleAuthorCanBeCreatedAndRecalled()
//    {
//        AuthorEntity authorEntityA = TestDataUtil.createTestAuthorA();
//        AuthorEntity authorEntityB = TestDataUtil.createTestAuthorB();
//        underTest.save(authorEntityA);
//        underTest.save(authorEntityB);
//        Iterable<AuthorEntity> result = underTest.findAll();
//        assertThat(result).hasSize(2).containsExactly(authorEntityA, authorEntityB);
//    }
//
//    @Test
//    public void testThatMultipleAuthorCanBeUpdated(){
//        AuthorEntity authorEntityA = TestDataUtil.createTestAuthorA();
//        underTest.save(authorEntityA);
//        authorEntityA.setName("2.0 MATT");
//        underTest.save(authorEntityA);
//        Optional<AuthorEntity> result = underTest.findById(authorEntityA.getId());
//        System.out.println(authorEntityA);
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(authorEntityA);
//    }

//    @Test
//    public void testThatAuthorCanBeDeleted()
//    {
//        AuthorEntity authorEntityA = TestDataUtil.createTestAuthorA();
//        underTest.save(authorEntityA);
//        underTest.deleteById(authorEntityA.getId());
//        Optional<AuthorEntity> result = underTest.findById(authorEntityA.getId());
//        assertThat(result).isEmpty();
//    }






}
