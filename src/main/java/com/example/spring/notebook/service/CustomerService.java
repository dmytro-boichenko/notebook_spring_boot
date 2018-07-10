package com.example.spring.notebook.service;

import com.example.spring.notebook.db.NotebookRepository;
import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.request.CustomerRequest;
import com.example.spring.notebook.request.PutCustomerRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Customer getCustomer(int id) {
        return repository.getCustomer(id);
    }

    public Collection<Customer> getCustomersPoisk(PutCustomerRequest request){
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

    public ArrayList<String> getCustomersCity() {
        ArrayList<String> customerCity = new ArrayList<String>();
        for (Customer customer : repository.getCustomers()) {
            customerCity.add(customer.getCity());
        }
        return customerCity;
    }

    public ArrayList<Integer> getCustomersId() {
        ArrayList<Integer> customersId = new ArrayList<Integer>();
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

    public void deleteCustomer(int id){
        repository.deleteCustomer(id);
    }

}
