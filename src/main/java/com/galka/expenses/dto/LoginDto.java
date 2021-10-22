package com.galka.expenses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    private Integer id;
    @NotEmpty(message = "Please insert username")
    @Size(min = 5, max = 25, message = "5 - 25 characters are required !")
    private String username;

    private String login;
    @NotEmpty
    @Email
    private String mail;
    @NotEmpty
    @Size(min = 5, max = 25, message = "5 - 25 characters are required !")
    private String password;
    @NotEmpty
    @Size(min = 5, max = 25, message = "5 - 25 characters are required !")
    private String confirmPassword;
}
