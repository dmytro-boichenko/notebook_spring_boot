<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <mete charset="UTF-8"/>
    <title>
        Update Customer!!
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<body>
<center>
    <h3>${updcustomer}</h3>
    <hr>


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