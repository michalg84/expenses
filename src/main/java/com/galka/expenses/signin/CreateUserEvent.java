package com.galka.expenses.signin;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor
@ToString
public class CreateUserEvent {

    private final String username;
    private final String mail;
    private final byte[] password;
    private final String confirmPassword;
}
