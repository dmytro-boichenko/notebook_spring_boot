CREATE DATABASE my2base;

CREATE TABLE my2base.Customers (CustomerID INTEGER(10) NOT NULL AUTO_INCREMENT, CustomerName VARCHAR(40) NOT NULL,
						ContactName VARCHAR(40) NOT NULL, Address VARCHAR(40) NOT NULL, City VARCHAR(40) NOT NULL,
						PostalCode VARCHAR(40) NOT NULL, Country VARCHAR(40) NOT NULL,
						PRIMARY KEY (CustomerID));
						
CREATE TABLE my2base.Categories (CategoryID INTEGER(10) NOT NULL AUTO_INCREMENT, CategoryName VARCHAR(20), Description VARCHAR(100),
						PRIMARY KEY (CategoryID));
						
CREATE TABLE my2base.Employees (EmployeeID INTEGER(10) NOT NULL AUTO_INCREMENT, LastName VARCHAR(40),
						FirstName VARCHAR(40), BirthDate DATE, Photo IMAGE, Notes VARCHAR(300), PRIMARY KEY (EmployeeID));
						
CREATE TABLE my2base.OrderDetails (OrderDetailID INTEGER(10) NOT NULL AUTO_INCREMENT, OrderID INTEGER(10), ProductID INTEGER(10),
							Quantity INTEGER(10),  PRIMARY KEY (OrderDetailID));
							
CREATE TABLE my2base.Orders (OrderID INTEGER(10) NOT NULL AUTO_INCREMENT, CustomerID INTEGER(10), EmployeeID INTEGER(10),
					OrderDate DATE, ShipperID INTEGER(10), PRIMARY KEY(OrderID));
					
CREATE TABLE my2base.Products (ProductID INTEGER(10) NOT NULL AUTO_INCREMENT, ProductName VARCHAR(40),
						SupplierID INTEGER(10), CategoryID INTEGER(10), Unit VARCHAR(60), Price DOUBLE,
						PRIMARY KEY(ProductID));
						
CREATE TABLE my2base.Shippers (ShipperID INTEGER(10) NOT NULL AUTO_INCREMENT, ShipperName VARCHAR(40),
						Phone VARCHAR(20), PRIMARY KEY(ShipperID));
						
CREATE TABLE my2base.Suppliers (SupplierID INTEGER(10) NOT NULL AUTO_INCREMENT, SupplierName VARCHAR(40),
						ContactName VARCHAR(40), Address VARCHAR(60), City VARCHAR(40), PostalCode VARCHAR(60),
						Country VARCHAR(40), Phone VARCHAR(20),	PRIMARY KEY(SupplierID)); 