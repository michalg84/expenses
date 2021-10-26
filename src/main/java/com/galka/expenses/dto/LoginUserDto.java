package com.galka.expenses.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginUserDto {

    @NotEmpty(message = "Please insert valid username")
    @Size(min = 5, max = 25, message = "5 - 25 characters are required !")
    private String username;
    @NotEmpty
    @Size(min = 5, max = 25, message = "5 - 25 characters are required !")
    private String password;
}
