package com.galka.expenses.signin;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter(AccessLevel.PACKAGE)
@ToString
@RequiredArgsConstructor
class RegisterUserCommand {

    private final String username;
    private final String mail;
    private final byte[] password;
    private final String confirmPassword;


}
