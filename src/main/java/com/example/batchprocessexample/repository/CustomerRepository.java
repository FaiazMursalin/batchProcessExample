package com.example.batchprocessexample.repository;

import com.example.batchprocessexample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
