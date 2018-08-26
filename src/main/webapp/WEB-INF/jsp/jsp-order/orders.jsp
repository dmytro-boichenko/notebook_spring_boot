<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

    <mete charset="UTF-8"/>
    <title>
        Orders
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<body>

    <h3>${Orders}</h3>

    <hr>
    <center>
    <p> Таблица ордеров </p>

    <table border="1" cellspacing="0" cellpadding="0">

        <thead>
        <tr>
            <td> OrderId</td>
            <td>CustomerId </td>
            <td>EmployeeId </td>
            <td>OrderDate </td>
            <td>ShipperId  </td>
        </tr>
        </thead>

        <c:forEach items="${service}" var="orders">
            <tr>
                <td> <c:out value="${orders.orderId}"/></td>
                <td> <c:out value="${orders.customerId}"/></td>
                <td> <c:out value="${orders.employeeId}"/></td>
                <td> <c:out value="${orders.orderDate}"/></td>
                <td> <c:out value="${orders.shipperId}"/></td>

            </tr>
        </c:forEach>

    </table>
    </center>

    <hr>

    <form action="/orders" method="GET">
       Get to previus page <input type="submit" name="back" value="Back">
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



</body>

</html>