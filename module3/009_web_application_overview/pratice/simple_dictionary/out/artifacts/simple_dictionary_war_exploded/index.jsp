<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 26/05/2021
  Time: 2:16 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="/translate">
  <input type="text" name="txtSearch" placeholder="Enter your word: "/>
  <input type = "submit" id = "submit" value = "Search"/>
</form>
</body>
</html>
