package com.example.spring.notebook.controller.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @GetMapping(value = {"/cust"})
    public String checkRequest(Map<String, Object> model) {
        model.put("message", this.message);
        //model.put("test_param", test);
        model.put("prob", "Privet, privet, privet!!!");
        return "/jsp-customer/cust";
    }

    @GetMapping(value = {"/", "/welcome"})
    public String getIndex(Map<String, Object> model) {
        model.put("message", "You get on page Notebook!!!");

        return "index";
    }

    @GetMapping(value = {"/customerById"})
    public String getForm(Map<String, Object> model) {

        model.put("par", "Param");

        return "/jsp-customer/customerById";
    }

    @GetMapping(value = {"/back", "/newcustomer"})
    public String getNewCustomerForm(Map<String, Object> model){
        model.put("newcustomer", "You can create new Customer");
        return "/jsp-customer/newcustomer";
    }
    @GetMapping(value = {"/backdelete", "/deleteById"})
    public String getDelete(Map<String, Object> model) {

        model.put("del", "You can deleted Customer by his Id!");

        return "/jsp-customer/deleteById";
    }

    @GetMapping(value = {"/backupdate", "/updateById"})
    public String getUpdate(Map<String, Object> model) {

        model.put("update", "You can update Customer by his Id!");

        return "/jsp-customer/updateById";
    }
    @GetMapping(value = {"/historyCustomerById"})
    public String getHistory(Map<String, Object> model) {

        model.put("historyCustomer", "You can see all history customer. You must eter id Customer!");

        return "/jsp-customer/allHistoryCustomerById";
    }
}