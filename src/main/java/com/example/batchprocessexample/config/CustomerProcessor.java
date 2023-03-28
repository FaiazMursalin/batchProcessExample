package com.example.batchprocessexample.config;

import com.example.batchprocessexample.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        //if need to filter out info we do it here
        //for ex if we want to filter out with only Bangladesh to be processed and sent to DB
//        if(customer.getCountry().equals("Bangladesh")){
//            return customer;
//        }else{
//            return null;
//        }
        return customer;
    }
}
