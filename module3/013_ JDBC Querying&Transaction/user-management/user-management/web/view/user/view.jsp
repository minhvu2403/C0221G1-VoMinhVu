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
    <link rel="stylesheet" href="/view/user/css/view.css">
</head>
<body>

<div class="container-fluid">
    <section class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="content mt-5">
                    <form action=""method="">
                        <div class="header-list">
                            <h1>User details</h1>
                            <table class="table table-striped table-hover">
                                <tr>
                                    <th>User ID:</th>
                                    <td>${user.id}</td>
                                </tr>
                                <tr>
                                    <th>User Name:</th>
                                    <td>${user.name}</td>
                                </tr>
                                <tr>
                                    <th>User Email :</th>
                                    <td>${user.email}</td>
                                </tr>
                                <tr>
                                    <th>Country:</th>
                                    <td>${user.country}</td>
                                </tr>
                            </table>
                            <div class="footer">
                                <a href="user?action=edit&id=${user.id}"><input type="button" class="btn btn-success" value="Edit"></a>
                                <a href="user?action=delete&id=${user.id}"><input type="button" class="btn btn-danger"  value="Delete"></a>
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