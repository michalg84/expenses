package com.galka.expenses.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RegisterUserDto {

    @NotEmpty(message = "Please insert valid username")
    @Size(min = 5, max = 25, message = "5 - 25 characters are required !")
    private String username;
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
