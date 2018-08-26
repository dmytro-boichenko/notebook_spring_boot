package com.example.spring.notebook.service;


import com.example.spring.notebook.db.MySqlRepository;
import com.example.spring.notebook.model.Order;
import com.example.spring.notebook.request.OrderRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Service
public class OrderService {

    private MySqlRepository repository;

    public OrderService(MySqlRepository repository) {
        this.repository = repository;
    }

    public Collection<Order> getOrders(){

        return repository.getOrders();

    }

    public Collection<Order> getOrderBy(Map<String, Object> map){
        //OrderRequest request = new OrderRequest();
        //request.setOrderId(map.get("OrderID"));
        Object orderId = map.get("OrderID");
        Object customerId = map.get("CustomerID");
        Object employeeId = map.get("EmployeeID");
        Object shipperId = map.get("ShipperID");

        Object[] arguments = new Object[]{orderId, customerId, employeeId, shipperId};

        return repository.getOrderBy(arguments);
    }
}
