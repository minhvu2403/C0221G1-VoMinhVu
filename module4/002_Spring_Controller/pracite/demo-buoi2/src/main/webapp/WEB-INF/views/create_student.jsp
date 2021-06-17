<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 17/06/2021
  Time: 10:28 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Student</title>
</head>
<body>
<h2>Create Student</h2>
<form:form action="/student/create" method="post" modelAttribute="student">
    <label>Name:</label>
    <form:input type="text" path="name" />
    <label> Date of birth:</label>
    <form:input type="date" path="dateOfBirth" />
    <input type="submit" value="Create new">
</form:form>
</body>
</html>
