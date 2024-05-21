package com.example.renderappapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private static final List<Customer> CUSTOMERS = List.of(
            new Customer(1L,"john","doe","john@email.com"),
            new Customer(2L,"mary","public","mary@email.com"),
            new Customer(3L,"elon","musk","musk@email.com"),
            new Customer(4L,"dummy","duncat","dumy@email.com")
    );

    @GetMapping
    public List<Customer> findllCustomer(){
        return CUSTOMERS;
    }



}
