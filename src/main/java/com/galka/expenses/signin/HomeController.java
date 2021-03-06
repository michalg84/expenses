package com.galka.expenses.signin;


import com.galka.expenses.signin.dto.RegisterUserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/")
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final CommandGateway commandGateway;

    private static final String REGISTER = "register";
    private static final String LOGIN = "login";

    @GetMapping(value = {REGISTER, "/"})
    public ModelAndView registerPage(ModelMap modelMap) {
        modelMap.addAttribute("registerUserDto", new RegisterUserDto());
        return new ModelAndView(REGISTER, modelMap);
    }

    @PostMapping(REGISTER)
    public String register(@ModelAttribute @Valid RegisterUserDto dto) {
        log.info("RegisterUserDto {}", dto);
        commandGateway.sendAndWait(new RegisterUserCommand(dto.getUsername(), dto.getMail(), dto.getPassword().getBytes(StandardCharsets.UTF_8), dto.getConfirmPassword()));
        return "redirect:user/account";
    }

    @GetMapping(LOGIN)
    public String loginPage() {
        return LOGIN;
    }

//    @PostMapping(LOGIN)
//    public String login(@ModelAttribute(name = "loginUserDto") @Valid LoginUserDto loginDto) {
//        log.info("loginUserDto {}", loginDto);
//        final byte[] pass = loginDto.getPassword().getBytes(StandardCharsets.UTF_8);
//        userDetailsService.loadUserByUsername()
//        new LoginCommand(loginDto.getUsername(), pass)
//        return LOGIN;
//    }


}
