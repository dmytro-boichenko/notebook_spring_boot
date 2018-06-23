package com.example.spring.notebook.db;

import com.example.spring.notebook.model.Categorie;
import com.example.spring.notebook.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class MySqlRepository implements NotebookRepository {

    private static final String SELECT_CUSTOMERS = "SELECT * FROM Customers";
    private static final String SELECT_CATEGORIES = "SELECT * FROM Categories";

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

    public Collection<Categorie> getCategories(){
        return jdbcTemplate.query(SELECT_CATEGORIES,
                (resultSet, i) -> {
                    Categorie categorie = new Categorie();
                    categorie.setId(resultSet.getInt("CATEGORYID"));
                    categorie.setCategorieName(resultSet.getString("CATEGORYNAME"));
                    categorie.setDescription(resultSet.getString("DESCRIPTION"));
                    return categorie;
                }) ;
        }

}
