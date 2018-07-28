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

<div>${test_param}</div>
<p>Ura</p>
<div>${prob}</div>
<hr>
<%--GET POST--%>
<form action="customerById" method="GET">

    <input type="submit" name="button1" value="Customer by Id"/>
    </form>
<hr>
<form action="customers" method="GET">
    <input type="submit" name="button2" value="Customers"/>
</form>

</body>

</html>