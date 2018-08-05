<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <mete charset="UTF-8"/>
    <title>
        Update Customer
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<body>
<center>
    <h3>${updatecustomer}</h3>
    <hr>
    <form>
        <div>Customer</div>
        <hr>
        <table cellspacing="0" cellpadding="4" border="1">
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
            <c items="${customer}" var="customer">
                <tr>
                    <td><c:out value="${customer.id}"/></td>
                    <td><c:out value="${customer.name}"/></td>
                    <td><c:out value="${customer.contactName}"/></td>
                    <td><c:out value="${customer.address}"/></td>
                    <td><c:out value="${customer.city}"/></td>
                    <td><c:out value="${customer.postalCode}"/></td>
                    <td><c:out value="${customer.country}"/></td>
                </tr>
            </c>
        </table>
    </form>
    <hr>
    <form action="upd" method="POST">
        <table >
            <tr>
                <td>Id</td>
                <td><input type="number" name="id" value="${customer.id}"/></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Contact Name</td>
                <td><input type="text" name="contactName"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>City</td>
                <td><input type="text" name="city"/></td>
            </tr>
            <tr>
                <td>Postal Code</td>
                <td><input type="text" name="postalCode"/></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><input type="text" name="country"/></td>
            </tr>
            <tr>
                <td>Отправить данные</td>
                <td><input type="submit" name="button" value="Enter"></td>
            </tr>

        </table>
    </form>
</center>

<hr>
<center>
    <form action="/backupdate" method="GET">
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