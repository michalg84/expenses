package com.galka.expenses.signin;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor
@ToString
public class UserSignInEvent {


    private final String username;
    private final String mail;
    private final String password;
    private final String confirmPassword;
}
