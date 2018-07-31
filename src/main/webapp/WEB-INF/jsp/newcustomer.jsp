<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <mete charset="UTF-8"/>
    <title>
        New Customer
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>



</head>
<body>
<center>
<h3>${newcustomer}</h3>
</center>

<hr>
<center>
<table width="780" border="0" cellspacing="0" cellpadding="0">
<form action="customers/newcustomer" method="POST">

    <table >
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
    <form action="/" method="GET">
        <table>
            <tr>
                <td>Вернуться к предидущей форме: </td>
                <td><input type="submit" name="backToStart" value="Назад"></td>
            </tr>
        </table>
    </form>
</table>
    <hr>
</center>

</body>

</html>