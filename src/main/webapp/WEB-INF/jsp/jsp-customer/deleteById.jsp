<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <mete charset="UTF-8"/>
    <title>
        Delete Customer
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>



</head>
<body>
<center>
    <h3>${del}</h3>
</center>

<hr>
<center>
    <table width="780" border="0" cellspacing="0" cellpadding="0">
        <form action="customers/delete" method="POST">

            <table >
                <tr>
                    <td>Customer ID</td>
                    <td><input type="number" name="id"/></td>
                </tr>
                <tr>
                    <td>Enter number</td>
                    <td><input type="submit" name="delete" value="Delete customer by Id"/></td>
                </tr>
            </table>



        </form>
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

</center>

</body>

</html>