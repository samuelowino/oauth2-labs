package com.authserver.sample.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class ApplesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_getAllApples() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/apples"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}