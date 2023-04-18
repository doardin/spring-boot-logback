package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public void teste() throws Exception {
        try {
            method1();
        } catch (Exception e) {
            throw e;
        }
    }

    public void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Error in method1", e);
        }
    }

    public void method2() throws Exception {
        try {
            int result = 1 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            throw new Exception("Error in method2", e);
        }
    }

}
