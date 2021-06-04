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
                    <form method="post" action="../customer">
                        <div class="header-list">
                            <h1>Creat Customer</h1>
                            <div class="list">
                                <form action="../customer" method="post">
                                <div class="scroll">
                                    <ul class="scroll-page ">
                                        <li>
                                            <div class="form-group">
                                                <label>Name</label>
                                                <input type="text" class="form-control" required name="name" id="name" >
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Date of birth</label>
                                                <input type="date" class="form-control" required name="birthday" id="birthday">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Gender</label>
                                                <input type="text" class="form-control" required name="gender" id="gender">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>ID Card</label>
                                                <input type="text" class="form-control" required name="idCard" id="idCard">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Phone number</label>
                                                <input type="number" class="form-control" required name="phone" id="phone">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Email</label>
                                                <input type="email" class="form-control" required name="email" id="email">
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Address</label>
                                                <textarea class="form-control" required name="address" id="address"></textarea>                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>customer_type_name</label>
                                                <select name="customerTypeId" class="custom-select">
                                                    <c:forEach var="customerType" items="${customerTypes}">
                                                        <option value="${customerType.id}">${customerType.name}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                </form>
                                <div class="footer">
                                    <input type="hidden" name="action" value="add">
                                    <input type="submit" class="btn btn-success" value="Add">
                                    <a href="/customer"><input type="button" class="btn btn-danger" data-dismiss="modal" value="Back"></a>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>

<%--
<div class="container-fluid">
    <div class="banner">
        <img src="/images/FURAMA.png" alt="">
    </div>
</div>
<div class="header navbar-fixed-top">
    <input type="checkbox" id="check">
    <label for="check">
        <i class="fa fa-bars" id="check-btn"></i>
        <i class="fa fa-times" id="cancel"></i>
    </label>
    <div class="logo">
        <img src="/images/logo.png" alt="">
    </div>
    <div class="list-menu">
        <ul>
            <li><a href="#">Home</a></li>
            <li>
                <a href="/user">Employee</a>
            </li>
            <li>
                <a href="#">Customer </a>
            </li>
            <li>
                <a href="#">Service </a>
            </li>
            <li>
                <a href="#">Contract</a>
            </li>
            <li class="search">
                <div class="tt">
                    <input type="text" placeholder="search...">
                    <button type="submit">Search</button>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="container-fluid">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-2">
                    <form method="post" action="/user">
                        <div class="header-list">
                            <h1>Creat User</h1>
                            <div class="list">
                                <form method="post" action="../user">
                                    <div class="form-group">
                                        <label>Name</label>
                                        <input type="text" class="form-control" required name="name" id="name">
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <input type="email" class="form-control" required name="email" id="email">
                                    </div>
                                    <div class="form-group">
                                        <label>Country</label>
                                        <input type="text" class="form-control" required name="country" id="country">
                                    </div>
                                </form>
                            </div>
                            <div class="footer">
                                <input type="hidden" name="action" value="add">
                                <input type="submit" class="btn btn-success" value="Add" >
                                <a href="/user"><input type="button" class="btn btn-danger"value="Back"></a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>
<script src="/js/home.js"></script>

--%>
</body>
</html>