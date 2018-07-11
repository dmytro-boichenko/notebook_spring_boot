package com.example.spring.notebook.model;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerOrder {

   private Customer customer;
   private ArrayList<Order> order = null;
   private ArrayList<Employee> employees = null;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }
}
