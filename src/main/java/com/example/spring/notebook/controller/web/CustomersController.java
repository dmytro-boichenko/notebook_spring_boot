package com.example.spring.notebook.controller.web;

import com.example.spring.notebook.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/customers")
public class CustomersController {

    private CustomerService customerService;

    public CustomersController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }
    @GetMapping("/number")

    public String getCustomer(Model model, @RequestParam("numberrr") int id){

        model.addAttribute("customer", customerService.getCustomer(id));

        //model.put("customer", "Ваши параметры: " + id);

        return "customer";
    }

}
