package com.galka.expenses.controller;


import com.galka.expenses.dto.LoginUserDto;
import com.galka.expenses.dto.RegisterUserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping(value = {"register", "/"})
    public ModelAndView registerPage(ModelMap modelMap) {
        modelMap.addAttribute("registerUserDto", new RegisterUserDto());
        return new ModelAndView("register", modelMap);
    }

    @PostMapping("register")
    public ModelAndView register(@ModelAttribute(name = "registerUserDto") @Valid RegisterUserDto registerUserDto) {
        log.info("RegisterUserDto {}", registerUserDto);
        return new ModelAndView("register");
    }

    @GetMapping("login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute(name = "loginUserDto") @Valid LoginUserDto loginDto) {
        log.info("loginUserDto {}", loginDto);
        return "login";
    }
}
