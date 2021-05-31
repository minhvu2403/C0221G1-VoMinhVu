<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/05/2021
  Time: 7:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/view/customer/css/create.css">

</head>
<body>
<div class="container-fluid">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-2">
                    <form method="post" action="/customer">
                        <div class="header-list">
                            <h1>Creat Customer</h1>
                            <div class="list">
                                <form action="../customer" method="post">
                                    <div class="form-group">
                                        <label>ID</label>
                                        <input type="text" class="form-control" required name="id">
                                    </div>
                                    <div class="form-group">
                                        <label>Name</label>
                                        <input type="text" class="form-control" required name="name">
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <input type="email" class="form-control" required name="email">
                                    </div>
                                    <div class="form-group">
                                        <label>Address</label>
                                        <textarea class="form-control" required name="address"></textarea>
                                    </div>
                                </form>
                            </div>
                            <div class="footer">
                                <input type="hidden" name="action" value="create">
                                <input type="submit" class="btn btn-success" value="Add" >
                                <a href="/customer"><input type="button" class="btn btn-danger"value="Back"></a>
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
