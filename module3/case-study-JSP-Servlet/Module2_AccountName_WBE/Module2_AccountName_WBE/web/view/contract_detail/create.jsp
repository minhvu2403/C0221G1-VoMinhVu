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
                            <h1>Creat Contract_Detail</h1>
                            <div class="list">
                                <c:if test="${message!=null}">
                                    <span style="color: #07f607; font-size: 18px;font-weight: bold; text-align: center;display: block">${message}</span>
                                </c:if>
                                <form  method="post">
                                <div class="scroll">
                                    <ul class="scroll-page ">
                                        <li>
                                            <div class="form-group">
                                                <label>quantity</label>
                                                <input type="text" class="form-control" required name="quantity" id="quantity" >
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>contract Id:</label>
                                                <select name="contract_id" class="custom-select">
                                                    <c:forEach var="contracts" items="${contracts}">
                                                        <option value="${contracts.contractId}">${contracts.contractId}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>AttachServiceId:t</label>
                                                <select name="attach_service_id" class="custom-select">
                                                    <c:forEach var="attachServices" items="${attachServices}">
                                                        <option value="${attachServices.attachServiceId}">${attachServices.attachServiceName}</option>
                                                    </c:forEach>
                                                </select>                                            </div>
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