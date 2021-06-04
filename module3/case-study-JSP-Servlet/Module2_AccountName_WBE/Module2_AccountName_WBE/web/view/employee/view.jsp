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
                            <h1>Employee detail</h1>
                            <div class="list">
                                    <div class="scroll">
                                        <ul class="scroll-page ">
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th> Employee Id:</th>
                                                        <td><c:out value="${employee.id}"></c:out></td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th> Employee Name:</th>
                                                        <td>${employee.name}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee Birthday:</th>
                                                        <td>${employee.birthday}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee IdCard:</th>
                                                        <td>${employee.idCard}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee phone:</th>
                                                        <td>${employee.phone}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee email:</th>
                                                        <td>${employee.email}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee Salary:</th>
                                                        <td>${employee.salary}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee position:</th>
                                                        <td>${employee.position}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee educationDegree:</th>
                                                        <td>${employee.educationDegree}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee Division:</th>
                                                        <td>${employee.division}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                            <li>
                                                <table class="table table-striped table-hover">
                                                    <tr>
                                                        <th>Employee Username:</th>
                                                        <td>${employee.username}</td>
                                                    </tr>
                                                </table>
                                            </li>
                                        </ul>
                                    </div>
                                <div class="footer">
                                    <a href="employee?action=edit&id=${employee.id}"><input type="button" class="btn btn-success" value="Edit"></a>
                                    <a href="employee?action=delete&id=${employee.id}"><input type="button" class="btn btn-danger"  value="Delete"></a>
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