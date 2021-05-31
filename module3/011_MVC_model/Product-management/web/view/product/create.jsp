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
    <link rel="stylesheet" href="../../view/product/css/create.css">

</head>
<body>
<div class="container-fluid">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-2">
                    <form method="post" action="/product">
                        <div class="header-list">
                            <h1>Creat Product</h1>
                            <div class="list">
                                <form action="../product" method="post">
                                    <div class="form-group">
                                        <label>ID</label>
                                        <input type="text" class="form-control" required name="id">
                                    </div>
                                    <div class="form-group">
                                        <label>Name</label>
                                        <input type="text" class="form-control" required name="name">
                                    </div>
                                    <div class="form-group">
                                        <label>Price</label>
                                        <input type="text" class="form-control" required name="price">
                                    </div>
                                    <div class="form-group">
                                        <label>Amount</label>
                                        <input type="text" class="form-control" required name="amount">
                                    </div>
                                    <div class="form-group">
                                        <label>ProductStatus</label>
                                        <input type="text" class="form-control" required name="productStatus">
                                    </div>
                                </form>
                            </div>
                            <div class="footer">
                                <input type="hidden" name="action" value="create">
                                <input type="submit" class="btn btn-success" value="Add" >
                                <a href="/product"><input type="button" class="btn btn-danger"value="Back"></a>
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