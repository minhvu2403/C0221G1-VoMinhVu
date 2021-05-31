<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 26/05/2021
  Time: 8:29 CH
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
    <link rel="stylesheet" href="css/creat_customer.css">
</head>
<body>
<div class="container-fluid">
    <div class="header ">
        <div class="row">
            <div class="col-md-12">
                <img src="images/FURAMA.png" alt="">
            </div>
        </div>
    </div>
</div>
<div class="container-fluid nen">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-2">
                    <form>
                        <div class="header-list">
                            <h1 class="p-3 d-flex justify-content-center">Creat Customer</h1>
                            <div class="list">
                                <div class="scroll pl-4 pr-4">
                                    <ul class="scroll-page ">
                                        <li>
                                            <div class="form-group">
                                                <label>ID</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Name</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Date of birth</label>
                                                <input type="date" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>ID Card</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Phone number</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Email</label>
                                                <input type="email" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Address</label>
                                                <textarea class="form-control" required></textarea>                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Gender</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="form-group">
                                                <label>Customer type</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="footer">
                                    <input type="submit" class="btn btn-success" value="Add">
                                    <input type="button" class="btn btn-danger" data-dismiss="modal" value="Back">
                                </div>
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
