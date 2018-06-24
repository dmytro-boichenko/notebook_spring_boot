package com.example.spring.notebook.service;

import com.example.spring.notebook.db.NotebookRepository;
import com.example.spring.notebook.model.Customer;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Service
public class CustomerCreateService {

    private NotebookRepository repository;

    public CustomerCreateService(NotebookRepository repository) {
        this.repository = repository;
    }

@Setter
    public void createCustomer() {
//        @GetMapping
//        @ResponseBody поля инициализируемые данными введенными с странички браузера

        String name = "";
        String contactName = "";
        String address = "";
        String city = "";
        String postalCode = "";
        String country = "";

        repository.createCustomer(name, contactName, address, city,
                postalCode, country );
    }
}
