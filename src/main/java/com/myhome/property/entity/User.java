package com.myhome.property.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="users")
public class User {

    /**
     * @Entity - meaning it should map to a table in your database
     * @Getter — generates getters for all fields.
     * @Setter — generates setters for all fields.
     * @NoArgsConstructor — generates a no-argument constructor.
     * @AllArgsConstructor — generates a constructor with all fields.
     * @Builder — enables the Builder pattern for this class:
     *          User user = User.builder()
     *                 .name("Narendra")
     *                 .email("narendra@gmail.com")
     *                 .build();
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String profileImageUrl;
}
