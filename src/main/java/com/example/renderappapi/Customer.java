package com.example.renderappapi;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;


}
