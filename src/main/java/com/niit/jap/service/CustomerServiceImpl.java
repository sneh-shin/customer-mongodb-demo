/*
 *Author Name: Sneha Shinde
 *Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.service;

import com.niit.jap.domain.Customer;
import com.niit.jap.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository repository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        repository.deleteById(customerId);
        return true;
    }
    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public List<Customer> getByProductName(String productName) {
        return repository.fetchItem(productName);
    }
}
