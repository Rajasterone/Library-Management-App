package com.rajibuilt.Library_Management_App.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


/**
 * Address entity class representing the Address table in the database.
 */
@Setter
@Getter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private int addressId; // Unique ID for each address

    @NotNull(message = "House number cannot be null")
    private Integer houseNumber; // House number of the address

    @NotBlank(message = "Area cannot be blank")
    @Size(max = 100, message = "Area must be less than 100 characters")
    private String area; // Area of the address

    @NotBlank(message = "City cannot be blank")
    @Size(max = 50, message = "City must be less than 50 characters")
    private String city; // City of the address

    @NotBlank(message = "State cannot be blank")
    @Size(max = 50, message = "State must be less than 50 characters")
    private String state; // State of the address

    @NotBlank(message = "Country cannot be blank")
    @Size(max = 50, message = "Country must be less than 50 characters")
    private String country; // Country of the address

    @NotNull(message = "Pincode cannot be null")
    private Long pincode; // Pincode of the address

}
