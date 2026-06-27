package com.nikhil.database.controllers;


import com.nikhil.database.TestDataUtil;
import com.nikhil.database.domain.entities.BookEntity;
import com.nikhil.database.services.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc

public class BookControllerIntegrationTest {

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;
    private BookService bookService;

    @Autowired
    public BookControllerIntegrationTest(MockMvc mockMvc, BookService bookService) {
        this.mockMvc = mockMvc;
        this.bookService = bookService;
        objectMapper = new ObjectMapper();

    }

//    @Test
//    public void test201StatusIsReturned() throws Exception {
//
////        AuthorEntity A = TestDataUtil.createTestAuthorA();
//        BookEntity B = TestDataUtil.createTestBookA(null);
//        String BookJson = objectMapper.writeValueAsString(B);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.put("/books/"+ B.getIsbn())
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(BookJson)
//
//        ).andExpect(MockMvcResultMatchers.status().isCreated());
//
//    }
//
//    @Test
//    public void testReturnsSavedBook() throws Exception {
//
//        BookEntity B = TestDataUtil.createTestBookA(null);
//        String BookJson = objectMapper.writeValueAsString(B);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.put("/books/"+ B.getIsbn())
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(BookJson)
//
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.isbn").value(B.getIsbn())
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.title").value(B.getTitle())
//        );
//
//    }
//    @Test
//    public void testListBooksStatus200() throws Exception {
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/books")
//                        .contentType(MediaType.APPLICATION_JSON)
//        ).andExpect(MockMvcResultMatchers.status().isOk());
//
//    }
//    @Test
//    public void testListOfBooks() throws Exception {
//
//        BookEntity testBookA = TestDataUtil.createTestBookA(null);
//        bookService.save(testBookA.getIsbn(),testBookA);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/books")
//                        .contentType(MediaType.APPLICATION_JSON)
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$[0].isbn").value(testBookA.getIsbn())
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$[0].title").value(testBookA.getTitle())
//        );
//
//    }
//
//    @Test
//    public void testFindOne200StatusIsReturned() throws Exception {
//
//
//        BookEntity testBookA = TestDataUtil.createTestBookA(null);
//        bookService.save(testBookA.getIsbn(),testBookA);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/books/"+testBookA.getIsbn())
//                        .contentType(MediaType.APPLICATION_JSON)
//
//        ).andExpect(MockMvcResultMatchers.status().isOk());
//
//    }
//    @Test
//    public void testFindOne404StatusIsReturned() throws Exception {
//
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/books/"+99)
//                        .contentType(MediaType.APPLICATION_JSON)
//
//        ).andExpect(MockMvcResultMatchers.status().isNotFound());
//
//    }
//    @Test
//    public void testReturnsSavedAuthorFineOne() throws Exception {
//
//        BookEntity testBookA = TestDataUtil.createTestBookA(null);
//        bookService.save(testBookA.getIsbn(),testBookA);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/books/"+testBookA.getIsbn())
//                        .contentType(MediaType.APPLICATION_JSON)
//
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.isbn").value(testBookA.getIsbn())
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.title").value(testBookA.getTitle())
//        );
//
//    }

}
