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
    <h3>${updCustomer}</h3>
</center>

<hr>
<center>
    <table width="780" border="0" cellspacing="0" cellpadding="0">
        <form action="customers/update" method="POST">

            <table >
                <tr>
                    <td>Customer ID</td>
                    <td><input type="number" name="id"/></td>
                </tr>
                <tr>
                    <td>Enter number</td>
                    <td><input type="submit" name="update" value="Update customer by Id"/></td>
                </tr>

            </table>
            <hr>
            <p>You enterd id customer: ${idNull}</p>
            <p>label: ${updatecustomer}</p>
        </form>
        <hr>


        <hr>

        <form action="/" method="GET">
            <table>
                <tr>
                    <td>Вернуться к предидущей форме: </td>
                    <td><input type="submit" name="backToStart" value="Back"></td>
                </tr>
            </table>
        </form>
    </table>
    <hr>
</center>

</body>

</html>