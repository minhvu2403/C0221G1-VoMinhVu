<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/05/2021
  Time: 9:54 CH
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
    <link rel="stylesheet" href="/view/customer/css/view.css">
</head>
<body>
<div class="container-fluid">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-5">
                    <form action="../customer"method="post">
                        <div class="header-list">
                            <h1>Customer details</h1>
                            <table class="table table-striped table-hover">
                                <tr>
                                    <th>Customer ID:</th>
                                    <td>${customer.id}</td>
                                </tr>
                                <tr>
                                    <th>Customer Name:</th>
                                    <td>${customer.name}</td>
                                </tr>
                                <tr>
                                    <th>Customer Email:</th>
                                    <td>${customer.email}</td>
                                </tr>
                                <tr>
                                    <th>Customer Address:</th>
                                    <td>${customer.address}</td>
                                </tr>
                            </table>
                            <div class="footer">
                                <a href="customer?action=edit&id=${customer.id}"><input type="button" class="btn btn-success" value="Edit"></a>
                                <a href="customer?action=delete&id=${customer.id}"><input type="button" class="btn btn-danger"  value="Delete"></a>
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
