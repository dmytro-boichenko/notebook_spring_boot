package com.example.spring.notebook.db;

import com.example.spring.notebook.model.Categorie;
import com.example.spring.notebook.model.Customer;
import com.example.spring.notebook.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class MySqlRepository implements NotebookRepository {

    private static final String SELECT_CUSTOMERS = "SELECT * FROM Customers";
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM Customers WHERE customerid = ?";
    private static final String SELECT_CUSTOMER_BY_ID_AND = "SELECT * FROM Customers WHERE customerid = ? or " +
            "customername = ? or contactname = ? or address = ? or city = ? or postalcode = ? or country = ?";

    private static final String SELECT_ORDER_BY_CUSTOMERID = "SELECT * FROM Orders WHERE customerid = ?";
    private static final String SELECT_ORDER = "SELECT * FROM Orders";

    private static final String SELECT_CATEGORIES = "SELECT * FROM Categories";


    public String value;
    private static final String INSERT_CUSTOMERS = "INSERT INTO Customers (CustomerName, ContactName," +
            " Address, City, PostalCode, Country) VALUE ";
    private static final String UPDATE_CUSTOMERS = "UPDATE Customers SET CustomerId = ?, CustomerName = ?," +
            " ContactName = ?, Address = ?, City = ?, PostalCode = ?, Country = ? WHERE CustomerId = ?";
    private static final String DELETE_CUSTOMERS = "DELETE FROM Customers WHERE CustomerId = ?";

    private JdbcTemplate jdbcTemplate;

    public MySqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Customer> CUSTOMER_MAPPER = (resultSet, i) -> {
        Customer customer = new Customer();
        customer.setId(resultSet.getInt("CUSTOMERID"));
        customer.setName(resultSet.getString("CUSTOMERNAME"));
        customer.setContactName(resultSet.getString("CONTACTNAME"));
        customer.setAddress(resultSet.getString("ADDRESS"));
        customer.setCity(resultSet.getString("CITY"));
        customer.setPostalCode(resultSet.getString("POSTALCODE"));
        customer.setCountry(resultSet.getString("COUNTRY"));
        return customer;
    };

    private RowMapper<Order> ORDER_MAPPER = (resultSet, i) ->{
        Order order = new Order();
        order.setOrderId(resultSet.getInt("ORDERID"));
        order.setCustomerId(resultSet.getInt("CUSTOMERID"));
        order.setEmployeeId(resultSet.getInt("EMPLOYEEID"));
        order.setOrderDate(resultSet.getDate("ORDERDATE"));
        order.setShipperId(resultSet.getInt("ShipperID"));
        return order;
    };


    public Collection<Customer> getCustomers() {
        return jdbcTemplate.query(SELECT_CUSTOMERS, CUSTOMER_MAPPER);
    }

    @Override
    public Customer getCustomer(int id) {
        Object[] arguments = new Object[]{id};
        return jdbcTemplate.queryForObject(SELECT_CUSTOMER_BY_ID, arguments, CUSTOMER_MAPPER);
    }


    public Collection<Order> getOrders(){
        return jdbcTemplate.query(SELECT_ORDER, ORDER_MAPPER);
    }

    public Collection<Order> getOrders(int customerId){

        Object[] arguments = new Object[]{customerId};
        return jdbcTemplate.query(SELECT_ORDER_BY_CUSTOMERID, arguments, ORDER_MAPPER);
    }
    public Collection<Customer> getCustomersPoisk(int id, String name, String contactName,
                                                  String address, String city, String postalCode, String country){
        Object[] arguments = new Object[]{id, name, contactName,
                address, city, postalCode, country};

        return jdbcTemplate.query(SELECT_CUSTOMER_BY_ID_AND, arguments, CUSTOMER_MAPPER);
    }

    public Collection<Categorie> getCategories() {
        return jdbcTemplate.query(SELECT_CATEGORIES,
                (resultSet, i) -> {
                    Categorie categorie = new Categorie();
                    categorie.setId(resultSet.getInt("CATEGORYID"));
                    categorie.setCategorieName(resultSet.getString("CATEGORYNAME"));
                    categorie.setDescription(resultSet.getString("DESCRIPTION"));
                    return categorie;
                });
    }

    public void createCustomer(String name, String contactName, String address, String city,
                               String postalCode, String country) {
//        Customer customer = new Customer();
//        customer.setId(0); // auto_increment
//        customer.setName("Kate");
//        customer.setContactName("Kate Sidorova");
//        customer.setAddress("Alekseev str. 16");
//        customer.setCity("Voroneg");
//        customer.setPostalCode("365234");
//        customer.setCountry("Russia");

        value = "('" + name + "', '" + contactName + "', '" + address + "', '" + city + "', '" + postalCode + "', '" +
                country + "')";
//        jdbcTemplate.update(INSERT_CUSTOMERS, name, contactName, address, city, postalCode, country);
        jdbcTemplate.update(INSERT_CUSTOMERS + value);

    }

    public void updateCustomer(int id, int customerId, String name, String contactName, String address, String city,
                               String postalCode, String country) {
        Customer customer = getCustomer(id);
        if(customerId == 0){
            customerId = customer.getId();
        }

        if (name == null) {
            name = customer.getName();
        }
        if (contactName == null) {
            contactName = customer.getContactName();
        }
        if (address == null) {
            address = customer.getAddress();
        }
        if (city == null) {
            city = customer.getCity();
        }
        if (postalCode == null) {
            postalCode = customer.getPostalCode();
        }
        if (country == null) {
            country = customer.getCountry();
        }

        Object[] arguments = new Object[]{customerId, name, contactName, address, city, postalCode, country, id};
        jdbcTemplate.update(UPDATE_CUSTOMERS, arguments);

    }

    public void deleteCustomer(int id){
        Object[] arguments = new Object[]{id};
        jdbcTemplate.update(DELETE_CUSTOMERS, arguments);
    }

}
