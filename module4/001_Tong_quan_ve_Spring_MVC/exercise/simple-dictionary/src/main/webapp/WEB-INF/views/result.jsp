<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14/06/2021
  Time: 4:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
     <c:if test="${not empty search}">
         search:${search};
     </c:if>
    <c:if test="${empty search}">
        Word not found.
    </c:if>
</h2>
</body>
</html>
