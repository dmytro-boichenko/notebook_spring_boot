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
        return "index";
    }

}