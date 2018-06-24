package com.example.spring.notebook.rest;

import com.example.spring.notebook.service.CustomerCreateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customerscreate")
public class CustomerCreateController {

    private CustomerCreateService service;

    public CustomerCreateController(CustomerCreateService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody


    public String createCustomer() {
        service.createCustomer();

        return "Customer create and insert into tabl";
          }
}
