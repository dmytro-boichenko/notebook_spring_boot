package com.example.spring.notebook.rest;

import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/customersid")
public class CustomerIdController {
    private CustomerService service;

    public CustomerIdController(CustomerService service){
        this.service = service;
    }

    @GetMapping
    @ResponseBody
public ArrayList<Integer> getCustomersId(){
        ArrayList<Integer> customersId = new ArrayList<>();
        for(Customer customer : service.getCustomers()){
            customersId.add(customer.getId());
        }
        return customersId;
    }

}
