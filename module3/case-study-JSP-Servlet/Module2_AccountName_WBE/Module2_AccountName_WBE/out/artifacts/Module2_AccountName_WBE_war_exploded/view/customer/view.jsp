<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 30/05/2021
  Time: 3:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="../../bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/creat_employee.css">
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
                    <form method="" action="">
                        <div class="header-list">
                            <h1>Customer detail</h1>
                            <div class="list">
                                    <div class="scroll">
                                        <ul class="scroll-page ">
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th> Customer Id:</th>
                                                        <td><c:out value="${customer.id}"></c:out></td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th> Customer Name:</th>
                                                        <td>${customer.name}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer Birthday:</th>
                                                        <td>${customer.birthday}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer gender:</th>
                                                        <td>${customer.gender}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer idCard:</th>
                                                        <td>${customer.idCard}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer phone:</th>
                                                        <td>${customer.phone}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer email:</th>
                                                        <td>${customer.email}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer address:</th>
                                                        <td>${customer.address}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Customer_type:</th>
                                                        <td>${customer.customerType}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                        </ul>
                                    </div>
                                <div class="footer">
                                    <a href="customer?action=edit&id=${customer.id}"><input type="button" class="btn btn-success" value="Edit"></a>
                                    <a href="customer?action=delete&id=${customer.id}"><input type="button" class="btn btn-danger"  value="Delete"></a>
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