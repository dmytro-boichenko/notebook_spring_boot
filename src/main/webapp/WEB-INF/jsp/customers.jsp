<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customers Page</title>
</head>
<body>
<div>Customers</div>
<table>
    <thead>
    <tr>
        <td>Name</td>
        <td>Contact Name</td>
        <td>Country</td>
    </tr>
    </thead>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.contactName}"/></td>
            <td><c:out value="${customer.country}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
