package com.example.spring.notebook.db;

import com.example.spring.notebook.model.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.example.spring.notebook.db.MySqlMethod;


import java.sql.ResultSet;
import java.util.*;

@Repository
public class MySqlRepository implements NotebookRepository {

    private static final String SELECT_CUSTOMERS = "SELECT * FROM Customers";
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM Customers WHERE customerid = ?";
    private static final String SELECT_CUSTOMER_BY_ID_AND = "SELECT * FROM Customers WHERE customerid = ? or " +
            "customername = ? or contactname = ? or address = ? or city = ? or postalcode = ? or country = ?";

    private static final String INSERT_CUSTOMERS = "INSERT INTO Customers (CustomerName, ContactName," +
            " Address, City, PostalCode, Country) VALUE ";
    private static final String UPDATE_CUSTOMERS = "UPDATE Customers SET CustomerId = ?, CustomerName = ?," +
            " ContactName = ?, Address = ?, City = ?, PostalCode = ?, Country = ? WHERE CustomerId = ?";
    private static final String DELETE_CUSTOMERS = "DELETE FROM Customers WHERE CustomerId = ?";

    private static final String HISTORY_CUSTOMER = "SELECT * FROM Customers LEFT JOIN Orders ON " +
            "Customers.CustomerID = Orders.CustomerID LEFT JOIN Employees ON Orders.EmployeeID = " +
            "Employees.EmployeeID LEFT JOIN OrderDetails ON Orders.OrderID =" +
            " OrderDetails.OrderID LEFT JOIN Products ON OrderDetails.ProductID = Products.ProductID" +
            " LEFT JOIN Categories ON Products.CategoryID = Categories.CategoryID" +
            " LEFT JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID " +
            "LEFT JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID WHERE Customers.CustomerId = ?";


    private static final String SELECT_EMPLOYEES = "SELECT * FROM Employees";
    private static final String SELECT_EMPLOYEES_BY_ID = "SELECT * FROM Employees WHERE EmployeeId = ?";

    private static final String SELECT_ORDER_BY_CUSTOMERID = "SELECT * FROM Orders WHERE customerid = ?";
    private static final String SELECT_ORDER = "SELECT * FROM Orders";

    private static final String SELECT_CATEGORIES = "SELECT * FROM Categories";

    private String value;

    private JdbcTemplate jdbcTemplate;

    public MySqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Делаем метод аналогичный RowMapper


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

    private RowMapper<Employee> EMPLOYEE_MAPPER = (resultSet, i) ->{
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getInt("EMPLOYEEID"));
        employee.setFirstName(resultSet.getString("FIRSTNAME"));
        employee.setLastName(resultSet.getString("LASTNAME"));
        employee.setBirthDate(resultSet.getDate("BIRTHDATE"));
        employee.setNotes(resultSet.getString("NOTES"));

        return employee;
    };

    private RowMapper<Categorie> CATEGORIE_MAPPER = (resultSet, i) -> {
        Categorie categorie = new Categorie();

        categorie.setId(resultSet.getInt("CATEGORIEID"));
        categorie.setCategorieName(resultSet.getString("CATEGORIENAME"));
        categorie.setDescription(resultSet.getString("DESCRIPTION"));

        return categorie;
    };

    private RowMapper<OrderDetail> ORDERDETAIL_MAPPER = (resultSet, i) -> {
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderDetailID(resultSet.getInt("ORDERDETAILID"));
        orderDetail.setOrderID(resultSet.getInt("ORDERID"));
        orderDetail.setProductID(resultSet.getInt("PRODUCTID"));
        orderDetail.setQuantity(resultSet.getInt("QUANTITY"));

        return orderDetail;
    };

    private RowMapper<Product> PRODUCT_MAPPER = (resultSet, i) -> {
        Product product = new Product();

        product.setProductID(resultSet.getInt("PRODUCTID"));
        product.setProductName(resultSet.getString("PRODUCTNAME"));
        product.setSupplierID(resultSet.getInt("SUPPLIERID"));
        product.setCategoryID(resultSet.getInt("CATEGORIEID"));
        product.setUnit(resultSet.getString("UNIT"));
        product.setPrice(resultSet.getDouble("PRICE"));

        return product;
    };

    private RowMapper<Shipper> SHIPPER_MAPPER = (resultSet, i) -> {
        Shipper shipper = new Shipper();

        shipper.setShipperID(resultSet.getInt("SHIPPERID"));
        shipper.setShipperName(resultSet.getString("SHIPPERNAME"));
        shipper.setShipperPhone(resultSet.getString("SHIPPERPHONE"));

        return shipper;
    };

    private RowMapper<Supplier> SUPPLIER_MAPPER = (resultSet, i) -> {
        Supplier supplier = new Supplier();

        supplier.setSupplierID(resultSet.getInt("SUPPLIERID"));
        supplier.setSupplierName(resultSet.getString("SUPPLIERNAME"));
        supplier.setSupContactName(resultSet.getString("SUPCONTACTNAME"));
        supplier.setSupAddress(resultSet.getString("SUPADDRESS"));
        supplier.setSupCity(resultSet.getString("SUPCITY"));
        supplier.setSupPostalCode(resultSet.getString("SUPPOSTALCODE"));
        supplier.setSupCountry(resultSet.getString("SUPCOUNTRY"));
        supplier.setSupplierPhone(resultSet.getString("SUPPLIERPHONE"));

        return supplier;
    };

    private RowMapper<HistoryCustomer> HISTORY_MAPPER = (resultSet, i)->{
        HistoryCustomer historyCustomer = new HistoryCustomer();
        MySqlMethod my = new MySqlMethod();

       Customer customers = my.getCustomerCollectionB(resultSet);
        historyCustomer.setCustomer(customers);

        Order order = my.getOrderCollectionB(resultSet);
        historyCustomer.setOrder(order);

        Employee employee = my.getEmployeeCollectionB(resultSet);
        historyCustomer.setEmployee(employee);

        OrderDetail orderDetail = my.getOrderDetailCollectionB(resultSet);
        historyCustomer.setOrderDetail(orderDetail);

        Product product = my.getProductCollectionB(resultSet);
        historyCustomer.setProduct(product);

        Categorie categorie = my.getCategorieCollectionB(resultSet);
        historyCustomer.setCategorie(categorie);

        Shipper shipper = my.getShipperCollectionB(resultSet);
        historyCustomer.setShipper(shipper);

        Supplier supplier = my.getSupplierCollectionB(resultSet);
        historyCustomer.setSupplier(supplier);

        return historyCustomer;
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

    public Collection<Employee> getEmployees(){
        return jdbcTemplate.query(SELECT_EMPLOYEES, EMPLOYEE_MAPPER);
    }
    public Employee getEmployee(int employeeId){
        Object[] arguments = new Object[]{employeeId};
        return jdbcTemplate.queryForObject(SELECT_EMPLOYEES_BY_ID, arguments, EMPLOYEE_MAPPER);
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



    public Collection<HistoryCustomer> getHistoryCustomer(int id){
        Object[] arguments = new Object[]{id};
        return jdbcTemplate.query(HISTORY_CUSTOMER, arguments, HISTORY_MAPPER);
    }


    }
