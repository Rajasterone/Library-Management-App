package com.rajibuilt.Library_Management_App.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BookDto {

    private int bookId;
    private String title;
    private String author;
    private LocalDateTime borrowedTime;
    private LocalDateTime returnTime;
    private boolean borrowed;
}