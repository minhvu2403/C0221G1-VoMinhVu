<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 30/05/2021
  Time: 3:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="../../bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/creat_employee.css">

</head>
<body>
<div class="container-fluid">
    <div class="header ">
        <div class="row">
            <div class="col-md-12">
                <img src="images/FURAMA.png" alt="">
            </div>
        </div>
    </div>
</div>
<div class="container-fluid nen">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-2">
                    <form method="post" action="../employee">
                        <div class="header-list">
                            <h1>Edit Employee</h1>
                            <div class="list">
                                    <div class="scroll">
                                        <ul class="scroll-page ">
                                            <form action="../employee" method="post">
                                            <li>
                                                <div class="form-group">
                                                    <label>ID</label>
                                                    <c:if test="${not empty employee}">
                                                    <input readonly type="text" class="form-control" required name="id" value="${employee.id}">
                                                    </c:if>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Name</label>
                                                    <input type="text" class="form-control" required name="name"  value="${employee.name}" >
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Date of birth</label>
                                                    <input type="date" class="form-control" required name="birthday"  value="${employee.birthday}">
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>ID Card</label>
                                                    <input type="text" class="form-control" required name="idCard"  value="${employee.idCard}">
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Phone number</label>
                                                    <input type="number" class="form-control" required name="phone"  value="${employee.phone}">
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Email</label>
                                                    <input type="email" class="form-control" required name="email"  value="${employee.email}">
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Address</label>
                                                    <textarea class="form-control" required name="address" ><c:out value="${employee.address}"></c:out></textarea>                            </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Salary</label>
                                                    <input type="text" class="form-control" required name="salary" value="${employee.salary}" >
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Position</label>
                                                    <select class="form-control" name="position_id">
                                                        <c:forEach var="position" items="${positions}">
                                                            <c:choose>
                                                                <c:when test="${position.positionName == employee.position}">
                                                                    <option value="${position.positionId}" selected>${position.positionName}</option>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <option value="${position.positionId}">${position.positionName}</option>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Education degree</label>
                                                    <select class="form-control" name="education_degree_id">
                                                        <c:forEach var="education" items="${educationDegrees}">
                                                            <c:choose>
                                                                <c:when test="${education.educationDegreeName == employee.educationDegree}">
                                                                    <option value="${education.educationDegreeId}" selected>${education.educationDegreeName}</option>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <option value="${education.educationDegreeId}">${education.educationDegreeName}</option>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>Division</label>
                                                    <select class="form-control" name="division_id">
                                                        <c:forEach var="division" items="${requestScope['divisions']}">
                                                            <c:choose>
                                                                <c:when test="${division.divisionName == employee.division}">
                                                                    <option value="${division.divisionId}" selected>${division.divisionName}</option>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <option value="${division.divisionId}">${division.divisionName}</option>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label>User</label>
                                                    <input readonly type="text" class="form-control" required name="username" value="${employee.username}">
                                                </div>
                                            </li>
                                            </form>
                                        </ul>

                                    </div>
                                <div class="footer">
                                    <input type="hidden" name="action" value="edit">
                                    <input type="submit" class="btn btn-success" value="Save">
                                    <a href="/employee"><input type="button" class="btn btn-danger" data-dismiss="modal" value="Back"></a>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>
</body>
</html>
</html>