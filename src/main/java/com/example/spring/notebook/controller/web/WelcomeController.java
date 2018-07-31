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

    @GetMapping(value = {"/", "/welcome"})
    public String checkRequest(Map<String, Object> model,
                               @RequestParam(defaultValue = "privet kak dela?") String test) {
        model.put("message", this.message);
        model.put("test_param", test);
        model.put("prob", "Privet, privet, privet!!!");
        return "index";
    }

    @GetMapping(value = {"/customerById"})
    public String getForm(Map<String, Object> model) {

        model.put("par", "Param");

        return "customerById";
    }

    @GetMapping(value = {"/back", "/newcustomer"})
    public String getNewCustomerForm(Map<String, Object> model){
        model.put("newcustomer", "You can create new Customer");
        return "newcustomer";
    }
    @GetMapping(value = {"/backdelete", "/deleteById"})
    public String getDelete(Map<String, Object> model) {

        model.put("del", "You can deleted Customer by his Id!");

        return "deleteById";
    }

    @GetMapping(value = {"/backupdate", "/updateById"})
    public String getUpdate(Map<String, Object> model) {

        model.put("update", "You can update Customer by his Id!");

        return "updateById";
    }
}