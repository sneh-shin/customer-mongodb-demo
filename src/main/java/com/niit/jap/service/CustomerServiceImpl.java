/*
 *Author Name: Sneha Shinde
 *Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.service;

import com.niit.jap.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer saveCustomer(Customer customer) {
        return null;
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return false;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public List<Customer> getByProductName(String productName) {
        return null;
    }
}
