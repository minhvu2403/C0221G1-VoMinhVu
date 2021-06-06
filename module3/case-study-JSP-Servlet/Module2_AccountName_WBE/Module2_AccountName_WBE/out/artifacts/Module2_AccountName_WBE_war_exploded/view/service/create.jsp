<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 30/05/2021
  Time: 3:44 CH
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
                    <form method="post">
                        <div class="header-list">
                            <h1>Creat Service</h1>
                            <div class="list">
                                <c:if test="${message!=null}">
                                    <span style="color: #07f607; font-size: 18px;font-weight: bold; text-align: center;display: block">${message}</span>
                                </c:if>
                                <form  method="post">
                                <div class="scroll">
                                    <ul class="scroll-page ">
                                        <li>
                                            <div class="form-group">
                                                <label>Name</label>
                                                <input type="text" class="form-control" required name="serviceName" id="name" >
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>service Area</label>
                                                <input type="text" class="form-control" required name="serviceArea" id="serviceArea">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>service Cost</label>
                                                <input type="text" class="form-control" required name="serviceCost" id="serviceCost">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>service Max People</label>
                                                <input type="text" class="form-control" required name="serviceMaxPeople" id="serviceMaxPeople">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>standard Room</label>
                                                <input type="text" class="form-control" required name="standardRoom" id="standardRoom">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>description</label>
                                                <input type="text" class="form-control" required name="description" id="description">
                                            </div>
                                        </li>

                                        <li>
                                            <div class="form-group">
                                                <label>poolArea</label>
                                                <input type="text" class="form-control" required name="poolArea" id="poolArea">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>number Of Floor</label>
                                                <input type="text" class="form-control" required name="numberOfFloor" id="numberOfFloor">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>serviceType Name</label>
                                                <select name="serviceTypeId" class="custom-select">
                                                    <c:forEach var="serviceType" items="${serviceTypes}">
                                                        <option value="${serviceType.serviceTypeId}">${serviceType.serviceTypeName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>rentType Name</label>
                                                <select name="rentTypeId" class="custom-select">
                                                    <c:forEach var="rentType" items="${rentTypes}">
                                                        <option value="${rentType.rentTypeId}">${rentType.rentTypeName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                </form>
                                <div class="footer">
                                    <input type="submit" class="btn btn-success" name="action" value="Add">
                                    <a href="/"><input type="button" class="btn btn-danger" data-dismiss="modal" value="Back"></a>
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