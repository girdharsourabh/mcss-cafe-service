package com.sourabh.mcsscoffeeservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sourabh.mcsscoffeeservice.model.CoffeeDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(CoffeeController.class)
class CoffeeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getCoffeeById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/coffee/" + UUID.randomUUID()).accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void saveNewCoffee() throws Exception {
        CoffeeDTO coffeeDTO = CoffeeDTO.builder().build();
        String coffeeDtoJson = objectMapper.writeValueAsString(coffeeDTO);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/coffee")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(coffeeDtoJson))
                        .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void updateCoffeeById() throws Exception {
        CoffeeDTO coffeeDTO = CoffeeDTO.builder().build();
        String coffeeDtoJson = objectMapper.writeValueAsString(coffeeDTO);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/coffee/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(coffeeDtoJson))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}