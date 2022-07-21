package com.example.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdApplicationTests {

    @Test
    void contextLoads() {

        assertEquals(3, Calculator.add(1, 2));



    }

}
