package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
// change the field to customerRepository object
@Service
public class CustomerService {

    private final static Logger LOGGER =
            LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers(){
        LOGGER.info("getCustomers was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id){
        return customerRepository
                .findById(id)
                .orElseThrow(
                        ()-> {
                            NotFoundException notFoundException =
                                    new NotFoundException(id + "customer not found");
                            LOGGER.error("error in getting customer {}", id, notFoundException);
                            return notFoundException;

                        });
    }
}
