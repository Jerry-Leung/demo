package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

