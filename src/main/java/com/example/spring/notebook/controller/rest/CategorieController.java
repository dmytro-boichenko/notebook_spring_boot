package com.example.spring.notebook.controller.rest;


import com.example.spring.notebook.model.Categorie;
import com.example.spring.notebook.service.CategorieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping("/rest/categories")
public class CategorieController {

    private CategorieService service;
    public CategorieController(CategorieService service){
        this.service = service;
    }
    @GetMapping
    @ResponseBody
    public Collection<Categorie> getCategories() {
        return service.getCategories();
    }
}
