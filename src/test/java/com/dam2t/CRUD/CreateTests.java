package com.dam2t.CRUD;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CreateTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldSaveJuegoCartas() throws Exception {
        mockMvc.perform(post("/cartas/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{    \"id\":2, \"nombre\": \"Parchis\", \"editorial\": \"Parchis\", \"temporada\": 1, \"num_cartas\": 16}"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void shouldSaveJuegoMesa() throws Exception {
        mockMvc.perform(post("/mesa/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"nombre\":\"Parchis\",\"editorial\":\"IGUAZU\",\"descripcion\":\"Se juega con un dado y 4 fichas para cada uno de los jugadores\",\"num_jugadores\":4,\"tipo\":\"mesa\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void shouldSaveJuegoRol() throws Exception {

        for (int i = 1; i < 3; i++) {
            String json = "{\"id\":"+ i +",\"nombre\":\"Dauntless\",\"editorial\":\"Epic Games\",\"nivel\":50}";

            mockMvc.perform(post("/rol/save")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(json))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        }



    }
}
