package com.example.spring.notebook.rest;

import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/customerscity")
public class CustomerCityController {
    private CustomerService service;

    public CustomerCityController(CustomerService service){
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public ArrayList<String> getCustomersCity(){
        ArrayList<String> customersCity = new ArrayList<>();
        for(Customer customer : service.getCustomers()){
            customersCity.add(customer.getCity());
        }
        return customersCity;
    }

}
