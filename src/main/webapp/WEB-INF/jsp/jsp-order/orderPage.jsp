<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

    <mete charset="UTF-8"/>
    <title>
        This is history Customer by Id!!
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<body>

<h1>WelcomeOrder</h1>
<p> Работаем таблицу ордеров</p>
<h2> You can see operation with Orders</h2>

<div>${Fraza}</div>
<hr>


    <table>
        <tr>
            <td>
            Запрос всех существующих ордеров
            </td>

            <td>
                <form action="/orders/allOrders" method="GET">
                <input type="submit" name="orders" value="Orders"/>
                </form>
            </td>
        </tr>
        <tr>
            <td>
                Запрос ордеров по<br>
                их id, customerId, и т д
            </td>

            <td>
                <form action="/orders/ordersBy" method="GET">
                    <input type="submit" name="ordersBy" value="OrdersBy"/>
                </form>
            </td>
        </tr>
        <tr>
            <td>
                Запрос истории всего ордера
            </td>

            <td>
                <form action="/orders/ordersHistory" method="GET">
                    <input type="submit" name="ordersHistory" value="OrdersHistory"/>
                </form>
            </td>
        </tr>
    </table>

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