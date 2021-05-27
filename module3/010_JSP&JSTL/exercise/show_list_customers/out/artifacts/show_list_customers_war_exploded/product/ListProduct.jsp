<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/05/2021
  Time: 10:37 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="content w-75 h-75 mt-5 d-flex mr-auto ml-auto">
        <table class="table table-primary  ">
            <thead>
            <tr>
                <th>Name</th>
                <th>Date of birth</th>
                <th>Address</th>
                <th>Image avatar</th>
            </tr>
            </thead>
            <c:forEach items="${products}" var="product">
            <tbody>
            <tr>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.dateOfBirth}"/></td>
                <td><c:out value="${product.address}"/></td>
                <td><img src="<c:out value="${product.image}"/>" height="50px" width="50px" alt=""></td>
            </tr>
            </tbody>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
