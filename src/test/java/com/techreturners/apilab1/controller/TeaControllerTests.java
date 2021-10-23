package com.techreturners.apilab1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class TeaControllerTests {
    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetHome() throws Exception {
        String expectedContent = "I love my tea";
        this.mockMvcController.perform(MockMvcRequestBuilders.get("/teaLover"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));

    }

    @Test
    public void testGetTeaWithoutRequestParams() throws Exception {
        String expectedContent = "gingerTea";
        this.mockMvcController.perform(MockMvcRequestBuilders.get("/tea"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name")
                        .value(expectedContent));
    }

    @Test
    public void TestGetTeaWithRequestParams() throws Exception {
        String expectedContent = "cardamomTea";
        this.mockMvcController.perform(MockMvcRequestBuilders.get("/tea")
                .param("teaName", "cardamomTea"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name")
                        .value(expectedContent));
    }
}
