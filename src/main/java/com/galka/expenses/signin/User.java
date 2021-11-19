package com.galka.expenses.signin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Set;

@Slf4j
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
    @OneToMany(targetEntity = Role.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Role> roles;


}
