<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/05/2021
  Time: 6:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${empty result}">
        <h2>Not found</h2>
    </c:when>
    <c:otherwise>
        <h2>Word: ${search}</h2>
        <h2>Result: ${result}</h2>
    </c:otherwise>
</c:choose>
</body>
</html>
