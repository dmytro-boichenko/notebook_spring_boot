package com.example.spring.notebook.controller.web;

import com.example.spring.notebook.request.CustomerRequest;
import com.example.spring.notebook.request.PutCustomerRequest;
import com.example.spring.notebook.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/customers")
public class CustomersController {

    private CustomerService customerService;

    public CustomersController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }
    @GetMapping("/number")

    public String getCustomer(Model model, @RequestParam("numberrr") int id){

        model.addAttribute("customer", customerService.getCustomer(id));

        return "customer";
    }

    @PostMapping("/newcustomer")
        public String getNewCustomer(Map<String, Object> model,
                                  @RequestParam Map<String, String> par){
        //customerService.createCustomer(request);
        //model.addAttribute("customer", customerService.getCustomer(id));
        CustomerRequest request = new CustomerRequest();
        request.setName(par.get("name"));
        request.setContactName(par.get("contactName"));
        request.setAddress(par.get("address"));
        request.setCity(par.get("city"));
        request.setPostalCode(par.get("postalCode"));
        request.setCountry(par.get("country"));

        //par.remove("button");

        customerService.createCustomer(request);

        model.put("newcustomeradd", "New Customer seccfull created!!!!! ");
        return "newcustomeradd";
    }

    @PostMapping("/delete")
    public String getDeleteCustomer(Map<String, String> model, @RequestParam("id") int id){
        customerService.deleteCustomer(id);

        model.put("deletecustomer", "Customer with " + id + " deleted!!!");

        return "deletecustomer";
    }

    @PostMapping("/update")
    public String getUpdateCustomer(Model model, @RequestParam("id") int a){

           model.addAttribute("customer", customerService.getCustomer(a));

            return "updateCustomer";
           }

    @PostMapping("/upd")
    public String getUpdateCustomerr(Map<String, Object> model, @RequestParam("id") int id,
                                     @RequestParam Map<String, String> par){

        PutCustomerRequest request = new PutCustomerRequest();
        request.setName(par.get("name"));
        request.setContactName(par.get("contactName"));
        request.setAddress(par.get("address"));
        request.setCity(par.get("city"));
        request.setPostalCode(par.get("postalCode"));
        request.setCountry(par.get("country"));

        customerService.updateCustomer(request, id);
        model.put("updcustomer", "Update Customer seccfull !!!!! ");
        return "updCustomer";
    }
}
