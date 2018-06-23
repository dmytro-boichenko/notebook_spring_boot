package com.example.spring.notebook.rest;

import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/customersname")

public class CustomerNameController {
    private CustomerService service;

    public CustomerNameController(CustomerService service){
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public ArrayList<String> getCustomersName(){
        ArrayList<String> customersName = new ArrayList<>();
        for(Customer customer : service.getCustomers()){
            customersName.add(customer.getName());
        }
        return customersName;
    }

}