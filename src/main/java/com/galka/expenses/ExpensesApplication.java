package com.galka.expenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ExpensesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExpensesApplication.class, args);

    }
}
