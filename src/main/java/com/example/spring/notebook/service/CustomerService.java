package com.example.spring.notebook.service;

import com.example.spring.notebook.db.NotebookRepository;
import com.example.spring.notebook.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerService {

    private NotebookRepository repository;

    public CustomerService(NotebookRepository repository) {
        this.repository = repository;
    }

    public Collection<Customer> getCustomers() {
        return repository.getCustomers();
    }
}
