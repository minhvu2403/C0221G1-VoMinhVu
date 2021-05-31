<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 30/05/2021
  Time: 3:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="../../bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/view/product/css/view.css">
</head>
<body>
<div class="container-fluid">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-5">
                    <form action="../customer"method="post">
                        <div class="header-list">
                            <h1>Product details</h1>
                            <table class="table table-striped table-hover">
                                <tr>
                                    <th>Product ID:</th>
                                    <td>${product.id}</td>
                                </tr>
                                <tr>
                                    <th>Product Name:</th>
                                    <td>${product.name}</td>
                                </tr>
                                <tr>
                                    <th>Product Price :</th>
                                    <td>${product.price}</td>
                                </tr>
                                <tr>
                                    <th>Product Amount:</th>
                                    <td>${product.amount}</td>
                                </tr>
                                <tr>
                                    <th>Product Status:</th>
                                    <td>${product.productStatus}</td>
                                </tr>
                            </table>
                            <div class="footer">
                                <a href="product?action=edit&id=${product.id}"><input type="button" class="btn btn-success" value="Edit"></a>
                                <a href="product?action=delete&id=${product.id}"><input type="button" class="btn btn-danger"  value="Delete"></a>
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