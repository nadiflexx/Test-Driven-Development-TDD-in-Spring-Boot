package com.dam2t.CRUD;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UpdateTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldUpdateJuegoCartasById() throws Exception {
        String json = "{    \"id\":1, \"nombre\": \"Sirio\", \"editorial\": \"Baraja Espanola\", \"temporada\": 2, \"num_cartas\": 40}";
        MvcResult result = mockMvc.perform(put("/cartas/change/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String jsonResponse = result.getResponse().getContentAsString();
        validateStructure("/cartas/" + JsonPath.read(jsonResponse, "$.id"), jsonResponse);
    }


    @Test
    void shouldUpdateJuegoRolNivelById() throws Exception {
        MvcResult result = mockMvc.perform(put("/rol/update/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("nivel", "8"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String jsonResponse = result.getResponse().getContentAsString();
        validateStructure("/rol/" + JsonPath.read(jsonResponse, "$.id"), jsonResponse);
    }


    @Test
    void shouldUpdateJuegoMesaTipoDescripcionById() throws Exception {
        MvcResult result = mockMvc.perform(put("/mesa/update/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("tipo", "entretenimiento")
                        .param("descripcion", "Es un juego de mesa derivado del pachisi y similar al ludo, al parques y al parcheesi"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String jsonResponse = result.getResponse().getContentAsString();
        validateStructure("/mesa/" + JsonPath.read(jsonResponse, "$.id"), jsonResponse);
    }

    void validateStructure(String path, String json) throws Exception {
        mockMvc.perform(get(path)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(json));
    }

}