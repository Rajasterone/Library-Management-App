package com.rajibuilt.Library_Management_App.dto;


import com.rajibuilt.Library_Management_App.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private boolean borrowed;
    private User borrowedBy;

}
