package com.mtx.sell.controller;

import com.mtx.sell.model.CustomerEntity;
import com.mtx.sell.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "customer/")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/add")
    public CustomerEntity add(){
        return  customerRepo.save(new CustomerEntity("test","test2"));

    }
}
