<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/06/2021
  Time: 3:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/js/bootstrap.min.js">


    <style>
        td {
            height: 40px;
        }
    </style>
</head>
<body>
<h1>Currency Converter</h1><br>
<form action="/convert" class="form-inline">
    <table>
        <tr>
            <td><h4><label for="exchange-rate">Exchange Rate:</label></h4></td>
            <td><input type="number" name="rate" id="exchange-rate" value="${rate}"></td>
        </tr>
        <tr>
            <td><h4><label for="usd">USD:</label></h4></td>
            <td><input type="number" name="usd" id="usd" value="${usd}"></td>
        </tr>
        <tr>
            <th colspan="2"><input type="submit" value="Convert"></th>
        </tr>
        <tr>
            <td><h4>VND:</h4></td>
            <td><h4>${vnd}</h4></td>
        </tr>
    </table>
</form>
</body>
</html>
