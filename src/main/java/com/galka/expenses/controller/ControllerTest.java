package com.galka.expenses.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@Slf4j
public class ControllerTest {

    @GetMapping("/test")
    public String testController() {
        log.info("test controller");
        return "test controller";
    }
}
