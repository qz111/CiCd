package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qz111
 * @create 2022-07-7/21/2022 9:55 AM
 */
@RestController
public class TestJenkins {
    @GetMapping("/hello")
    public String cicdTest(){
        return "hello, It is a jenkins docker CICD test.";
    }
}
