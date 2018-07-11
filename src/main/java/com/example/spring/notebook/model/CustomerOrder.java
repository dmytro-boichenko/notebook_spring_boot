package com.example.spring.notebook.model;

import java.util.Collection;

public class CustomerOrder {

   private Customer customer;
   private Collection<Order> order;

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
