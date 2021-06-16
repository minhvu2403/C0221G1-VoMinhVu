<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/06/2021
  Time: 4:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validation</title>
    <style>
        table{
            border-collapse: collapse;
        }
        th{
            border-bottom: 2px solid black;
        }
    </style>
</head>
<body>
<form action="/save" method="get">
    <h2>Sandwich Condiments</h2>
    <table>
        <tr>
            <th><input type="checkbox" name="condiment" value="Lettuce">Lettuce</th>
            <th><input type="checkbox" name="condiment" value="Tomato">Tomato</th>
            <th><input type="checkbox" name="condiment" value="Mustard">Mustard</th>
            <th><input type="checkbox" name="condiment" value="Sprouts">Sprouts</th>
        </tr>
        <tr>
            <td><input type="submit" value="Save"></td>

        </tr>
    </table>
</form>

</body>
</html>
