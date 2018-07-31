<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <mete charset="UTF-8"/>
    <title>
        New Customer ADD
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>



</head>
<body>
<center>
    <h3>${newcustomeradd}</h3>
</center>

<hr>
<center>
    <form action="/back" method="GET">
        <input type="submit" name="back" value="Back">
    </form>
</center>

</body>

</html>