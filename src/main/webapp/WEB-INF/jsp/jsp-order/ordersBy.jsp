<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <style>
        input.videmost{
            visibility:hidden;
        }
    </style>

    <mete charset="UTF-8"/>
    <title>
        OrdersBy
    </title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<form>

<h3>${OrdersBy}</h3>
</form>
<hr>
    <form id="orderID" action="/orders/ordersParam" method="GET">
<center>
    <p> Поиск ордера(ов) по одному из предложенных парамтеров</p>

    <table border="1" cellspacing="0" cellpadding="0">

        <thead>
        <tr>
            <td> OrderId</td>
            <td>CustomerId </td>
            <td>EmployeeId </td>
            <td>OrderDate </td>
            <td>ShipperId  </td>
        </tr>
         </thead>

       <tr>
            <td>

                   <input type="number" name="OrderID" id="Order"/>


                    <input  type="checkbox" name="box1" checked="checked"
                            onclick='if(this.checked){getElementById("Order").style.display = "block"}
                            else{getElementById("Order").style.display = "none"} '>Поле OrderId</input>

           </td>

           <td>
               <input type="number" class="videmost" name="CustomerID" id="Customer"/>

                   <input  type="checkbox" name="box2"
                           onclick='if(this.checked){getElementById("Customer").style.visibility = "visible"}
                            else{getElementById("Customer").style.visibility = "hidden"} '>Поле CustomerId</input>


               </td>

           <td>

                   <input  type="checkbox" name="box3"
                           onclick='if(this.checked){getElementById("Employee").style.visibility = "visible"}
                            else{getElementById("Employee").style.visibility = "hidden"} '>Поле EmployeeId</input>

                   <input type="number" class="videmost" name="EmployeeID" id="Employee"/>


               </td>
           <td>
               <input  type="checkbox" name="box4"
                       onclick='if(this.checked){getElementById("Datef").style.visibility = "visible"}
                            else{getElementById("Datef").style.visibility = "hidden"} '>Поле OrderDate</input>

               <input type="Date" class="videmost" id="Datef" name="OrderDate"/>
           </td>
           <td>

                   <input  type="checkbox" name="box5"
                           onclick='if(this.checked){getElementById("Shipper").style.visibility = "visible"}
                            else{getElementById("Shipper").style.visibility = "hidden"} '>Поле ShipperId</input>

                   <input type="number" class="videmost" name="ShipperID" id="Shipper"/>


                </td>
       </tr>
    </table>
    <input type="submit" name="button" value="Enter"/>

</center>
    </form>

<hr>

<form action="/orders" method="GET">
    Get to previus page <input type="submit" name="back" value="Back">
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



</body>

</html>