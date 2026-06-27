package com.nikhil.database.controllers;


import com.nikhil.database.TestDataUtil;
import com.nikhil.database.domain.entities.AuthorEntity;
import com.nikhil.database.services.AuthorService;
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
public class AuthorControllerIntegrationTest {

    private AuthorService authorService;
    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @Autowired
    public AuthorControllerIntegrationTest(MockMvc mockMvc, AuthorService authorService) {
        this.mockMvc = mockMvc;
        this.authorService = authorService;
        objectMapper = new ObjectMapper();
    }

//    @Test
//    public void test201StatusIsReturned() throws Exception {
//
//        AuthorEntity A = TestDataUtil.createTestAuthorA();
//        String AuthorJson = objectMapper.writeValueAsString(A);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.post("/authors")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(AuthorJson)
//
//        ).andExpect(MockMvcResultMatchers.status().isCreated());
//
//    }
//
//    @Test
//    public void testReturnsSavedAuthor() throws Exception {
//
//        AuthorEntity A = TestDataUtil.createTestAuthorA();
//        String AuthorJson = objectMapper.writeValueAsString(A);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.post("/authors")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(AuthorJson)
//
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.id").isNumber()
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.name").value("Abigail Rose")
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.age").value("80")
//        );
//
//    }
//
//    @Test
//    public void testListAuthorsStatus200() throws Exception {
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/authors")
//                        .contentType(MediaType.APPLICATION_JSON)
//        ).andExpect(MockMvcResultMatchers.status().isOk());
//
//    }
//    @Test
//    public void testListOfAuthors() throws Exception {
//
//        AuthorEntity testAuthorA = TestDataUtil.createTestAuthorA();
//        authorService.save(testAuthorA);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/authors")
//                        .contentType(MediaType.APPLICATION_JSON)
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$[0].id").isNumber()
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$[0].name").value("Abigail Rose")
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$[0].age").value("80")
//        );
//
//    }
//
//    @Test
//    public void testFindOne200StatusIsReturned() throws Exception {
//
//
//        AuthorEntity testAuthorA = TestDataUtil.createTestAuthorA();
//        authorService.save(testAuthorA);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/authors/"+testAuthorA.getId())
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
//                MockMvcRequestBuilders.get("/authors/"+99)
//                        .contentType(MediaType.APPLICATION_JSON)
//
//        ).andExpect(MockMvcResultMatchers.status().isNotFound());
//
//    }
//
//    @Test
//    public void testReturnsSavedAuthorFineOne() throws Exception {
//
//        AuthorEntity A = TestDataUtil.createTestAuthorA();
//        authorService.save(A);
//
//        mockMvc.perform(
//
//                MockMvcRequestBuilders.get("/authors/"+A.getId())
//                        .contentType(MediaType.APPLICATION_JSON)
//
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.id").value(A.getId())
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.name").value("Abigail Rose")
//        ).andExpect(
//                MockMvcResultMatchers.jsonPath("$.age").value("80")
//        );
//
//    }

}
