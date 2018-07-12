package com.example.spring.notebook.model;

import java.util.Collection;
import java.util.List;

public class CustomerOrder {

   private Customer customer;
   private Collection<Order> order = null;
   private List<Employee> employees = null;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
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

    public void setOrder(Collection<Order> order) {
        this.order = order;
    }
}
