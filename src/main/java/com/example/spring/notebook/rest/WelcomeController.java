package com.example.spring.notebook.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @GetMapping(value = {"/", "/welcome"})
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "index";
    }

}