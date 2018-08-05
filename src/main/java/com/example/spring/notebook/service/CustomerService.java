package com.example.spring.notebook.service;

import com.example.spring.notebook.db.NotebookRepository;
import com.example.spring.notebook.model.*;
import com.example.spring.notebook.request.CustomerRequest;
import com.example.spring.notebook.request.PutCustomerRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
public class CustomerService {

    private NotebookRepository repository;

    public CustomerService(NotebookRepository repository) {
        this.repository = repository;
    }

    public Collection<Customer> getCustomers() {
        return repository.getCustomers();
    }

    public Customer getCustomer(int id) {
        return repository.getCustomer(id);
    }

    public Collection<Order> getCustomerOrders() {
        return repository.getOrders();
    }

    public CustomerOrder getCustomerOrders(int id) {
        Customer customer = repository.getCustomer(id);
        Collection<Order> orders = repository.getOrders(id);
        List<Employee> employeesList = new ArrayList<>();

        for (Order order : orders) {
            int employeeId = order.getEmployeeId();
            Employee employee = repository.getEmployee(employeeId);
            employeesList.add(employee);
        }

        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCustomer(customer);
        customerOrder.setOrder(orders);
        customerOrder.setEmployees(employeesList);

        return customerOrder;
    }

    public CustomerOrder getCustomerOrders(int id, int j) {
        Customer customer = repository.getCustomer(id);
        Collection<Order> orders = repository.getOrders(id);
        ArrayList<Order> orderList = new ArrayList<>();

        for (Order order : orders) {
            int orderId = order.getOrderId();
            if (orderId == j) {
                orderList.add(order);
            }

        }
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCustomer(customer);
        customerOrder.setOrder(orderList);

        return customerOrder;
    }

    public Collection<Customer> getCustomersPoisk(PutCustomerRequest request) {
        return repository.getCustomersPoisk(request.getId(), request.getName(), request.getContactName(), request.getAddress(),
                request.getCity(), request.getPostalCode(), request.getCountry());
    }

    public ArrayList<String> getCustomersName() {
        ArrayList<String> customersName = new ArrayList<>();
        for (Customer customer : repository.getCustomers()) {
            customersName.add(customer.getName());

        }
        return customersName;
    }

    public List<String> getCustomersCity() {
        List<String> customerCity = new ArrayList<>();
        for (Customer customer : repository.getCustomers()) {
            customerCity.add(customer.getCity());
        }
        return customerCity;
    }

    public ArrayList<Integer> getCustomersId() {
        ArrayList<Integer> customersId = new ArrayList<>();
        for (Customer customer : repository.getCustomers()) {
            customersId.add(customer.getId());
        }
        return customersId;
    }

    public void createCustomer(CustomerRequest request) {
        repository.createCustomer(request.getName(), request.getContactName(), request.getAddress(),
                request.getCity(), request.getPostalCode(), request.getCountry());
    }

    public void updateCustomer(PutCustomerRequest request, int id) {
        repository.updateCustomer(id, request.getId(), request.getName(), request.getContactName(), request.getAddress(),
                request.getCity(), request.getPostalCode(), request.getCountry());
    }

    public void deleteCustomer(int id) {
        repository.deleteCustomer(id);
    }

    public Collection<HistoryCustomer> getHistoryCustomer(int id){

        return repository.getHistoryCustomer(id);

    }

}
