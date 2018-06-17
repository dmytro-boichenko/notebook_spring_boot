package com.example.spring.notebook.db;

import com.example.spring.notebook.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class MySqlRepository implements NotebookRepository {

    private static final String SELECT_CUSTOMERS = "SELECT * FROM Customers";

    private JdbcTemplate jdbcTemplate;

    public MySqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Collection<Customer> getCustomers() {
        return jdbcTemplate.query(SELECT_CUSTOMERS,
                (resultSet, i) -> {
                    Customer customer = new Customer();
                    customer.setId(resultSet.getInt("CUSTOMERID"));
                    customer.setName(resultSet.getString("CUSTOMERNAME"));
                    customer.setContactName(resultSet.getString("CONTACTNAME"));
                    customer.setAddress(resultSet.getString("ADDRESS"));
                    customer.setCity(resultSet.getString("CITY"));
                    customer.setPostalCode(resultSet.getString("POSTALCODE"));
                    customer.setCountry(resultSet.getString("COUNTRY"));
                    return customer;
                });
    }

}
