package com.example.spring.notebook.db;

import com.example.spring.notebook.model.*;

import java.util.Collection;

public interface NotebookRepository {

    Collection<Customer> getCustomers();

    Customer getCustomer(int id);

    Collection<Order> getOrders(int customerId);
    Collection<Order> getOrders();

    Collection<Customer> getCustomersPoisk(int id, String name, String contactName,
                                           String address, String city, String postalCode, String country);

    Collection<Employee> getEmployees();
    Employee getEmployee(int employeeId);

    Collection<Categorie> getCategories();

    void createCustomer(String name, String contactName, String address, String city,
                        String postalCode, String country );
    void updateCustomer(int id, int customerId, String name, String contactName, String address, String city,
                        String postalCode, String country);
    void deleteCustomer(int id);
    Collection<HistoryCustomer> getHistoryCustomer(int id);

}
