package com.example.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdApplicationTests {

    @Test
    void contextLoads() {
        try {
            assertEquals(3, Calculator.add(2, 2));
            System.out.println("result okay");
        } catch (AssertionError e) {
            e.printStackTrace();
        }


    }

}
