<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16/06/2021
  Time: 9:59 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../../../resources/bootstrap-4.6.0-dist/css/bootstrap.css">

<html>
<head>
    <title>Title</title>
    <style>
        .table th, .table td{
            border: none;
        }
    </style>
</head>
<body>
<h3 class="container w-50">Settings</h3>
<form:form action="/info" method="post" modelAttribute= "setting" >
    <table class="table container w-50 ">
        <tr>
            <td><b>Language: </b></td>
            <td colspan="2">
                <form:select path="language" cssClass="custom-select">
                    <form:options items="${languages}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><b>Page Size: </b></td>
            <td colspan="2">
                Show:
                <form:select path="pageSize" cssClass="custom-select w-25">
                    <form:options items="${pageSizes}"></form:options>
                </form:select>
                email per page
            </td>
        </tr>
        <tr>
            <td><b>Spams filter: </b></td>
            <td colspan="2">
                <form:checkbox path="spam" value="1"></form:checkbox>
                Enable spams filters
            </td>
        </tr>
        <tr>
            <td><b>Signature: </b></td>
            <td colspan="2">
                <form:textarea cssClass="form-control" rows="3" path="signature"></form:textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" class="btn btn-primary" value="update"></td>
            <td><input type="submit" value="cancel" class="btn btn-secondary"></td>
        </tr>
    </table>
</form:form>
</body>
</html>