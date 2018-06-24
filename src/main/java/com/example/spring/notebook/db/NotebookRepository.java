package com.example.spring.notebook.db;

import com.example.spring.notebook.model.Categorie;
import com.example.spring.notebook.model.Customer;

import java.util.Collection;

public interface NotebookRepository {

    Collection<Customer> getCustomers();
    Collection<Categorie> getCategories();
    void createCustomer(String name, String contactName, String address, String city,
                        String postalCode, String country );

}
