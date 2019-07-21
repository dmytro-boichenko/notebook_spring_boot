<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
</head>
<body>

<h1>Welcome</h1>
<h2>${message}</h2>


<hr>
<%--GET POST--%>
<form action="/cust" method="GET">

    <input type="submit" name="customer" value="All about Customer"/>
</form>
<hr>
<form action="/orders" method="GET">

    <input type="submit" name="order" value="All about Order"/>
</form>
<hr>
<form action="/image" method="GET">

    <input type="submit" name="img" value="Image"/>
</form>
<hr>

</body>

</html>