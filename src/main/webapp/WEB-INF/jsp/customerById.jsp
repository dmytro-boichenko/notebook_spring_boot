<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <mete charset="UTF-8"/>
    <title>
        CustomerById
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>



</head>
<body>
<h3>You can see a customer which has number</h3>

<hr>
<form>
    <%
        String button = request.getParameter("button1");

    %>
    <p>
        Button was flash: <%=button%>
    </p>

</form>
<form action="customers/number" method="GET">
    Enter number of customer: <input type="number" id="text1" name="numberrr"/>
                            <input type="submit" id="but1" name="Get customer by Id"
                                   value="Enter(Ввести)"/>

</form>
<div>
    <p>${par}</p>
</div>

</body>

</html>