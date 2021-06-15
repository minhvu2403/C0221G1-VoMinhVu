<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14/06/2021
  Time: 3:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Dictionary</h1><br>
<form action="/translate">
    <h3><label for="word">Word: <input type="text" name="word" id="word" value="${word}"></label>
        <input type="submit" value="Translate">
    </h3>
</form>
</body>
</html>
