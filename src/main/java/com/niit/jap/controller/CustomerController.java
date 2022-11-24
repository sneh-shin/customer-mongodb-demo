/*
 *Author Name: Sneha Shinde
 *Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.domain.Customer;
import com.niit.jap.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private CustomerServiceImpl service;
    @Autowired
    public CustomerController(CustomerServiceImpl service) {
        this.service = service;
    }
    @PostMapping("/saveItem")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(service.saveCustomer(customer), HttpStatus.CREATED);
    }
}
