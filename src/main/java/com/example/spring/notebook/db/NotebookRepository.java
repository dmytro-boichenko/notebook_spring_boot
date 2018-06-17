package com.example.spring.notebook.db;

import com.example.spring.notebook.model.Customer;

import java.util.Collection;

public interface NotebookRepository {

    Collection<Customer> getCustomers();

}
