package com.example.spring.notebook.db;

import com.example.spring.notebook.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class MySqlMethod {

        protected Customer getCustomerCollectionB(ResultSet resultSet) throws SQLException {
        Customer customer = new Customer();

        customer.setId(resultSet.getInt("CUSTOMERID"));
        customer.setName(resultSet.getString("CUSTOMERNAME"));
        customer.setContactName(resultSet.getString("CONTACTNAME"));
        customer.setAddress(resultSet.getString("ADDRESS"));
        customer.setCity(resultSet.getString("CITY"));
        customer.setPostalCode(resultSet.getString("POSTALCODE"));
        customer.setCountry(resultSet.getString("COUNTRY"));

        return customer;
    }

    protected Categorie getCategorieCollectionB(ResultSet resultSet) throws  SQLException{
        Categorie categorie = new Categorie();

        categorie.setId(resultSet.getInt("CATEGORYID"));
        categorie.setCategorieName(resultSet.getString("CATEGORYNAME"));
        categorie.setDescription(resultSet.getString("DESCRIPTION"));

        return categorie;
    }


    protected Employee getEmployeeCollectionB(ResultSet resultSet) throws SQLException{
        Employee employee = new Employee();

        employee.setEmployeeId(resultSet.getInt("EMPLOYEEID"));
        employee.setFirstName(resultSet.getString("FIRSTNAME"));
        employee.setLastName(resultSet.getString("LASTNAME"));
        employee.setBirthDate(resultSet.getDate("BIRTHDATE"));
        employee.setNotes(resultSet.getString("NOTES"));

        return employee;
    }


    protected Order getOrderCollectionB(ResultSet resultSet) throws SQLException{
        Order order = new Order();

        order.setOrderId(resultSet.getInt("ORDERID"));
        order.setCustomerId(resultSet.getInt("CUSTOMERID"));
        order.setEmployeeId(resultSet.getInt("EMPLOYEEID"));
        order.setOrderDate(resultSet.getDate("ORDERDATE"));
        order.setShipperId(resultSet.getInt("ShipperID"));

        return order;
    }

    protected OrderDetail getOrderDetailCollectionB(ResultSet resultSet) throws SQLException{
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderDetailID(resultSet.getInt("ORDERDETAILID"));
        orderDetail.setOrderID(resultSet.getInt("ORDERID"));
        orderDetail.setProductID(resultSet.getInt("PRODUCTID"));
        orderDetail.setQuantity(resultSet.getInt("QUANTITY"));

        return orderDetail;
    }

    protected Product getProductCollectionB(ResultSet resultSet) throws SQLException{
        Product product = new Product();

        product.setProductID(resultSet.getInt("PRODUCTID"));
        product.setProductName(resultSet.getString("PRODUCTNAME"));
        product.setSupplierID(resultSet.getInt("SUPPLIERID"));
        product.setCategoryID(resultSet.getInt("CATEGORYID"));
        product.setUnit(resultSet.getString("UNIT"));
        product.setPrice(resultSet.getDouble("PRICE"));

        return product;
    }

    protected Shipper getShipperCollectionB(ResultSet resultSet) throws SQLException{
        Shipper shipper = new Shipper();

        shipper.setShipperID(resultSet.getInt("SHIPPERID"));
        shipper.setShipperName(resultSet.getString("SHIPPERNAME"));
        shipper.setShipperPhone(resultSet.getString("SHIPPERPHONE"));

        return shipper;
    }

    protected Supplier getSupplierCollectionB(ResultSet resultSet) throws SQLException{
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
        }

    }
