<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/06/2021
  Time: 4:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../../../resources/bootstrap-4.6.0-dist/css/bootstrap.css">

    <style>
        h2{
            color: red;
        }
        table{
            margin: 5px;
            padding: 0;
            border-collapse: collapse;
            border: 1px solid black;
            background-color: #7fffa3;

        }
        .table{
            width: 40%;
        }
        input,select{
            border-radius: 7px ;
        }
    </style>
</head>
<body>

<form action="/calculator" method="get">
    <table class="table container">
        <tr>
            <th colspan="2">
                <h3>Calculator</h3>
            </th>
        </tr>
        <tr>
            <td>First operand:</td>
            <td><input type="number" name="firstOperand" class="form-control" required></td>
        </tr>
        <tr>
            <td>Operator:</td>
            <td>
                <select name="operator" class="custom-select">
                    <option value="Addition">Addition</option>
                    <option value="Subtraction">Subtraction</option>
                    <option value="Multiplication">Multiplication</option>
                    <option value="Division">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second operand:</td>
            <td><input type="number" name="secondOperand" class="form-control" required></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit" class="btn btn-primary btn-lg">Calculate</button>
            </td>
        </tr>
        <tr>
            <td>Result:</td>
            <td>${operator} ${total}</td>
        </tr>
    </table>
</form>
</body>
</html>
