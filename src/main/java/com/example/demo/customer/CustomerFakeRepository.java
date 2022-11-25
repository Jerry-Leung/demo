package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "passwordJames1", "email@gmail.com"),
                new Customer(2L, "Jamila Ahmed", "passwordJamila2", "email@gmail.com")
        );
    }
}
