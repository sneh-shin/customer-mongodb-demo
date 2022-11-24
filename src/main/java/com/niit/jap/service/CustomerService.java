package com.niit.jap.service;

import com.niit.jap.domain.Customer;
import com.niit.jap.exception.CustomerAlreadyExists;
import com.niit.jap.exception.CustomerIdNotFound;
import com.niit.jap.exception.ProductNotFound;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer) throws CustomerAlreadyExists;
    boolean deleteCustomer(int customerId) throws CustomerIdNotFound;
    List<Customer> getAllCustomers();
    List<Customer> findAllCustomerFromProductName(String productName) throws ProductNotFound;
}
