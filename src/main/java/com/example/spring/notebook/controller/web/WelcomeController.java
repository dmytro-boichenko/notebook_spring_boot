package com.example.spring.notebook.controller.web;

import com.example.spring.notebook.model.Imag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
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

    @GetMapping(value = {"/image"})
    public String getImage(Map<String, Object> model) throws IOException {
        model.put("message", this.message);
        //model.put("test_param", test);


        ArrayList<Imag> list = new ArrayList<Imag>();

        for(int i=0; i<10; i++){
            Imag image = new Imag();
            image.setTitle("tttttt");
            image.setAbout("aaaaaa");
            image.setImg("http://pikchyriki.net/avatar/krutye/100/47.jpg");

            list.add(image);
        }
        model.put("prob", "Privet, privet, privet!!!");
        model.put("list", list);
        model.put("im", "http://pikchyriki.net/avatar/krutye/100/47.jpg");
        return "image";
    }
}