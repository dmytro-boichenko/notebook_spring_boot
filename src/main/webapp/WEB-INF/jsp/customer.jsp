<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
<div>CustomerR</div>
<hr>
<p>
    ${customer}</p>
${param}
<hr>

<div>Customers</div>
<table cellspacing="0" cellpadding="4" border="1">
    <thead>
    <tr>
        <td>Name</td>
        <td>Contact Name</td>
        <td>Country</td>
        <td>Address</td>
        <td>City</td>
    </tr>
    </thead>
    <c items="${customer}" var="customer">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.contactName}"/></td>
            <td><c:out value="${customer.country}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><c:out value="${customer.city}"/></td>
        </tr>
    </c>
</table>
</body>
</html>
