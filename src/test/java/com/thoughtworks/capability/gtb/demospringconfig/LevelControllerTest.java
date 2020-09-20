package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class LevelControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Value("${levelNumber}")
    private int levelNumber;

    @Test
    void shouldReturnBasicWhenLevelNumberIsLessThanOne() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(jsonPath("$",is("advanced")))
                .andExpect(status().isOk());
    }

}