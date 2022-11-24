/*
 *Author Name: Sneha Shinde
 *Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.domain.Customer;
import com.niit.jap.exception.CustomerAlreadyExists;
import com.niit.jap.exception.CustomerIdNotFound;
import com.niit.jap.exception.ProductNotFound;
import com.niit.jap.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private CustomerService service;
    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }
    @PostMapping("/saveItem")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) throws CustomerAlreadyExists {
        return new ResponseEntity<>(service.saveCustomer(customer), HttpStatus.CREATED);
    }
    @GetMapping("/getValue")
    public ResponseEntity<?> getCustomer(){
        return new ResponseEntity<>(service.getAllCustomers(),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/deleteValue/{customerId}")
    public ResponseEntity<?> deleteCustomer(@PathVariable int customerId)throws CustomerIdNotFound {
        return new ResponseEntity<>(service.deleteCustomer(customerId),HttpStatus.ACCEPTED);
    }
    @GetMapping("/getValue/{productName}")
    public ResponseEntity<?> getByName(@PathVariable String productName) throws ProductNotFound {
        return new ResponseEntity<>(service.findAllCustomerFromProductName(productName),HttpStatus.ACCEPTED);
    }
}
