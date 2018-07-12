package com.example.spring.notebook.service;

import com.example.spring.notebook.db.NotebookRepository;
import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.model.CustomerOrder;
import com.example.spring.notebook.model.Employee;
import com.example.spring.notebook.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    private static final int CUSTOMER_ID = 123;
    private static final int ORDER_ID = 456;
    private static final int EMPLOYEE_ID = 789;

    @Mock
    private
    NotebookRepository  repository;

    @InjectMocks
    private
    CustomerService service;

    @Test
    public void getCustomerOrders() {
        when(repository.getCustomer(anyInt())).thenReturn(createCustomer());
        when(repository.getOrders(anyInt())).thenReturn(createOrders());
        when(repository.getEmployee(anyInt())).thenReturn(createEmployee());

        CustomerOrder order = service.getCustomerOrders(CUSTOMER_ID);
        assertThat(order, is(notNullValue()));

        Customer customer = order.getCustomer();
        assertThat(customer, is(notNullValue()));
        assertThat(customer.getId(), is(CUSTOMER_ID));
    }

    @Test
    public void getCustomerOrders_EmptyOrders() {
        when(repository.getCustomer(anyInt())).thenReturn(createCustomer());
        when(repository.getOrders(anyInt())).thenReturn(Collections.emptySet());

        CustomerOrder order = service.getCustomerOrders(CUSTOMER_ID);
        assertThat(order, is(notNullValue()));

        Customer customer = order.getCustomer();
        assertThat(customer, is(notNullValue()));
        assertThat(customer.getId(), is(CUSTOMER_ID));
    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        customer.setId(CUSTOMER_ID);
        return customer;
    }

    private Collection<Order> createOrders() {
        Order order = new Order();
        order.setOrderId(ORDER_ID);
        order.setCustomerId(CUSTOMER_ID);
        return Collections.singleton(order);
    }

    private Employee createEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeId(EMPLOYEE_ID);
        return employee;
    }
}