<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customers Page</title>
</head>
<body>
<div><h3>Customers</h3></div>
<hr>
<table border="1" cellspacing="0" cellpadding="0">
    <thead>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Contact Name</td>
        <td>Address</td>
        <td>City</td>
        <td>PostalCode</td>
        <td>Country</td>
    </tr>
    </thead>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td><c:out value="${customer.id}"/></td>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.contactName}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><c:out value="${customer.city}"/></td>
            <td><c:out value="${customer.postalCode}"/></td>
            <td><c:out value="${customer.country}"/></td>
        </tr>
    </c:forEach>
</table>
<hr>
<form action="/cust" method="GET">
    <table>
        <tr>
            <td>Вернуться к предидущей форме: </td>
            <td><input type="submit" name="backToCust" value="Back"></td>
        </tr>
    </table>
</form>
</table>
<hr>
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
