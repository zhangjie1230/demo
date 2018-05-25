package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Helloboot {
    @RequestMapping("/hello")
    public String getString(){
        return "hello boot with commit4";
    }
}
