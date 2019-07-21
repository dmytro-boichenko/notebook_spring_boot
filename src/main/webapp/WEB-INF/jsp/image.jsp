<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>

</head>
<body>
<div id="container">

    <div id="header">
        <h2>header (шапка сайта)</h2>
    </div>

    <div id="navigation">
        <h2>Блок навигации</h2>
        <hr>
        <div id="but">
            <input type="button" value="Haiggggg"></input>
        </div>

        <div id="but">
            <input type="button" value="Haiggggg"></input>
        </div>

        <div id="but">
            <input type="button" value="Haiggggg"></input>
        </div>

        <div id="but">
            <input type="button" value="Haiggggg"></input>
        </div>

        <div id="but">
            <input type="button" value="Haiggggg"></input>
        </div>
    </div>

    <div id="sidebar">
        <h2>Левая панель</h2>
        <hr>
        dfhsfhdfsd
        <hr>
        dhfjdghlsf
        <hr>
        lajvlkfj
    </div>

    <div id="content">
        <h2>Основной контент страницы</h2>

        <hr>
        <div id="test">
            <div id="photo">
                <img src="file:///E:/Java/images/test.jpg" alt="Зайка">
            </div>

            <div id="about">
                I love
                <hr>
                Yes
            </div>

        </div>

        <c:forEach items="${list}" var="img">
        <div id="test">


            <div id="photo">
                <img src=<c:out value="${img.img}"/> alt="Зайка">
            </div>

            <div id="about">
                <c:out value="${img.title}"/>
                <hr>
                <c:out value="${img.about}"/>
            </div>

        </div>
        </c:forEach>

        <div id="test">
            <div id="photo">
                <img src="http://pikchyriki.net/avatar/krutye/100/47.jpg" alt="Зайка">
            </div>

            <div id="about">
                I love
                <hr>
                Yes
            </div>

        </div>


${prob}
        <hr>
<table id="table">
        <c:forEach items="${list}" var="img">
            <tr>
                <td><c:out value="${img.title}"/></td>
                <td><c:out value="${img.about}"/></td>
                <td><img src=<c:out value="${img.img}"/> ></td>



            </tr>
        </c:forEach>

</table>
    </div>

    <div id="clear">

    </div>

    <div id="footer">
        <h2>footer (низ сайта)</h2>
    </div>
</div>





</body>
</html>