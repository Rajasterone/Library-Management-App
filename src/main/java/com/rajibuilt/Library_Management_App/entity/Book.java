package com.rajibuilt.Library_Management_App.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "book")
public class Book {
    @Id
//    @GeneratedValue (strategy =  = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "borrowed")
    boolean borrowed;
    @Column(name = "borrower")
    private User borrower;




}
