package com.dam2t.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class JuegoCartasControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldFindJuegoCartasById() throws Exception {
        mockMvc.perform(get("/cartas/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
