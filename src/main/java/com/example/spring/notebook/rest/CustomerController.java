package com.example.spring.notebook.rest;

import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.model.CustomerOrder;
import com.example.spring.notebook.model.Order;
import com.example.spring.notebook.request.CustomerRequest;
import com.example.spring.notebook.request.PutCustomerRequest;
import com.example.spring.notebook.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public Collection<Customer> getCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Customer getCustomer(@PathVariable int id) {

        return service.getCustomer(id);
    }

    @GetMapping("/customerorders")
    @ResponseBody
    public Collection<Order> getCustomerOrders(){
        return service.getCustomerOrders();
    }

    @GetMapping("/customerorders/{id}")
    @ResponseBody
    public CustomerOrder getCustomerOrders(@PathVariable int id){
        return service.getCustomerOrders(id);
    }

    @GetMapping("/customerorders/{id},{orderId}")
    @ResponseBody
    public CustomerOrder getCustomerOrders(@PathVariable int id, @PathVariable int orderId){
        return service.getCustomerOrders(id, orderId);
    }

    @PutMapping("/poisk")
    @ResponseBody
    public Collection<Customer> getCustomersPoisk(@RequestBody PutCustomerRequest request){
        return service.getCustomersPoisk(request);
    }
    //@RequestBody PutCustomerRequest request
//    @GetMapping("/{id}")
//    @ResponseBody
//    public String getCus(@PathVariable int id){
//        return "You Customer " + id + "Geted";
//    }


    @GetMapping("/names")
    @ResponseBody
    public ArrayList<String> getCustomersName() {

        return service.getCustomersName();
    }

    @GetMapping("/city")
    @ResponseBody
    public ArrayList<String> getCustomersCity() {
        return service.getCustomersCity();
    }

    @GetMapping("/idd")
    @ResponseBody
    public ArrayList<Integer> getCustomersId() {
        return service.getCustomersId();
    }


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String createCustomer(@Valid @RequestBody CustomerRequest request) {
        service.createCustomer(request);
        return "New Customer created! successfully";
    }
//{0: "Sidorov", 1: "Serg", 2: "strit", 3: "Donetsk", 4: "678975", 5: "Rf"} Content-Type: application/json
//"name": "Sidorov", "contactName": "Serg", "address": "striit", "city": "Voroneg", "postalCode": "324456", "country": "RF"

//{ "name": "Gorkovenko", "contactName": "Anna", "address": "striit", "city": "Voroneg", "postalCode": "324456", "country": "RF" }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String updateCustomer(@Valid @RequestBody PutCustomerRequest request, @PathVariable int id) {

        service.updateCustomer(request, id);

        return "Updating successfully finished";
    }
 @DeleteMapping("/delete/{id}")
 @ResponseBody
    public String deleteCustomer(@PathVariable int id){
        service.deleteCustomer(id);
        return "Delete successfully finished";
    }
    @GetMapping("/hai")
    @ResponseBody
    public String hai(){
        return "fkjbndjkhne;kjnkr";
    }

}
