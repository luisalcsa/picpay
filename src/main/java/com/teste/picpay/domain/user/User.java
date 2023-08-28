package com.teste.picpay.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name= "users")
@Table(name= "users")
@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String documente;
    @Column(unique = true)
    private String email;
    private String password;
    private Double balance;
    @Enumerated(EnumType.STRING)
    private com.teste.picpay.domain.user.UserType UserType;
}
