<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

    <mete charset="UTF-8"/>
    <title>
        This is history Customer by Id!!
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<body>
<center>
    <h3>${history}</h3>
    <h1>Privet all</h1>
    <hr>
    <table border="1" cellspacing="0" cellpadding="0">
    <thead>
    <tr>
        <td>Name</td>
        <td>City</td>
        <td>Country</td>
        <td>OI</td>
        <td>Order DATE</td>
        <td>First Name</td>
        <td>Bith Day</td>
        <td>Qu</td>
        <td>PI</td>
        <td>Product Name</td>
        <td>Unit</td>
        <td>Price</td>
        <td>CategoryName</td>
        <td>ShipperName</td>
        <td>ShipperPhone</td>
        <td>SupplierName</td>
        <td>SupplierPhone</td>

    </tr>
    </thead>


    <c:forEach items="${h}" var="history">
        <tr>

            <td><c:out value="${history.customer.name}"/></td>

            <td><c:out value="${history.customer.city}"/></td>

            <td><c:out value="${history.customer.country}"/></td>

            <td><c:out value="${history.order.orderId}"/></td>

            <td><c:out value="${history.order.orderDate}"/></td>

            <td><c:out value="${history.employee.firstName}"/></td>

            <td><c:out value="${history.employee.birthDate}"/></td>

            <td><c:out value="${history.orderDetail.quantity}"/></td>

            <td><c:out value="${history.product.productID}"/></td>

            <td><c:out value="${history.product.productName}"/></td>

            <td><c:out value="${history.product.unit}"/></td>

            <td><c:out value="${history.product.price}"/></td>

            <td><c:out value="${history.categorie.categorieName}"/></td>

            <td><c:out value="${history.shipper.shipperName}"/></td>

            <td><c:out value="${history.shipper.shipperPhone}"/></td>

            <td><c:out value="${history.supplier.supplierName}"/></td>

            <td><c:out value="${history.supplier.supplierPhone}"/></td>



        </tr>
    </c:forEach>

    </table>
    <p>${hh}</p>
    <hr>

    <form action="/historyCustomerById" method="GET">
        <input type="submit" name="back" value="Back">
    </form>
    <hr>
    <form action="/welcome" method="GET">
        <table>
            <tr>
                <td>Get to start page: </td>
                <td><input type="submit" name="backToStart" value="Back"></td>
            </tr>
        </table>
    </form>

</center>

</body>

</html>