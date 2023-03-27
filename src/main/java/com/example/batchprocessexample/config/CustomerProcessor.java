package com.example.batchprocessexample.config;

import com.example.batchprocessexample.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        //if need to filter out info we do it here
        return customer;
    }
}
