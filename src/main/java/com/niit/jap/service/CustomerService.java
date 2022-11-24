package com.niit.jap.service;

import com.niit.jap.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    boolean deleteCustomer(int customerId);
    List<Customer> getAllCustomers();
    List<Customer> getByProductName(String productName);
}
