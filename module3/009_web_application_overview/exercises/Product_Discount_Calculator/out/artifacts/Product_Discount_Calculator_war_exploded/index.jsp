<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 26/05/2021
  Time: 9:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<form action="/discount"method="post">
  <div class="container">
    <div class="form-group row">
      <label class="col-2 col-form-label">Product Description</label>
      <input class="form-control col-10" type="text" placeholder="Product Description" name="description">
    </div>
    <div class="form-group row">
      <label class="col-2 col-form-label">List Price</label>
      <input class="form-control col-10" type="text" placeholder="List Price" name="price">
    </div>
    <div class="form-group row">
      <label class="col-2 col-form-label">Discount Percent</label>
      <input class="form-control col-10" type="text" placeholder="Discount Percent" name="percent">
    </div>
    <input type="submit" value="Enter" class="btn btn-primary">
  </div>
</form>
</body>
</html>

