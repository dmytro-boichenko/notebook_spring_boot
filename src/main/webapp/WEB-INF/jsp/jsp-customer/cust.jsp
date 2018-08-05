<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Cust</title>
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
<hr>
<form action="newcustomer" method="GET">
    <input type="submit" name="button3" value="New customer"/>
</form>
<hr>
<form action="deleteById" method="GET">
    <input type="submit" name="buttonDelete" value="Delete Customer by Id"/>
</form>
<hr>
<form action="updateById" method="GET">
    <input type="submit" name="buttonUpdate" value="Update Customer by Id"/>
</form>
<hr>
<form action="historyCustomerById" method="GET">
    <input type="submit" name="buttonAllhistory" value="All history Customer"/>
</form>
<hr>

<hr>

<form action="/" method="GET">
    <table>
        <tr>
            <td>Get to previus page: </td>
            <td><input type="submit" name="backToStart" value="Back"></td>
        </tr>
    </table>
</form>
</table>
<hr>

</body>

</html>