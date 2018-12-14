<%@page isELIgnored="false" contentType="text/html; chaeset=UTF-8" pageEncoding="UTF-8"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head></head>
    <body>
        <c:forEach items="${sessionScope.list}" var="user">
            ${user.id}<br/>
            ${user.name}<br/>
        </c:forEach>

    </body>
</html>