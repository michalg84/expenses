package com.galka.expenses.signin;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(unique = true)
    private String login;
    @Column(unique = true)
    private String mail;
    @Column
    private String password;


}
