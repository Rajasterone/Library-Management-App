package com.rajibuilt.Library_Management_App.entity;

import jakarta.persistence.*;


import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int userid;           // Unique user ID
    private String name;          // User's name
    private long phoneNumber;     // User's phone number
    private String email;         // User's email address

    @OneToOne
    private Address address;      // Associated Address entity

}
