<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/05/2021
  Time: 8:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="../bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../customer/css/list.css">
</head>
<body>




<div class="container">
    <div class="table-wrapper">
        <div class="table-title">
            <div class="row">
                <div class="col-sm-6">
                    <h2>Manage <b>Customer</b></h2>
                </div>
                <div class="col-sm-6">
                    <a  href="customer?action=create" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Customer</span></a>
                    <a href="#deleteServiceModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xe92b;</i> <span>Delete</span></a>
                </div>
            </div>
        </div>
        <table class="table table-striped table-hover" id="list">
            <thead>
            <tr>
                <th>
                    <span class="custom-checkbox">
                        <input type="checkbox" id="selectAll">
                        <label for="selectAll"></label>
                    </span>
                </th>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Actions</th>
            </tr>
            </thead>

            <tbody> <c:forEach items='${customers}' var="customer">
            <tr>
                <td>
                    <span class="custom-checkbox">
                        <input type="checkbox" id="checkbox1" name="options[]" value="1">
                        <label for="checkbox1"></label>
                    </span>
                </td>
                <td><a href="customer?action=view&id=${customer.id}">${customer.id}</a></td>
                <td><a href="customer?action=view&id=${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td>
                    <a href="customer?action=#editServiceModal&id=${customer.id}" class="edit"  data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                    <a href="#deleteServiceModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                </td>
            </tr> </c:forEach>
            </tbody>

        </table>
        <div class="clearfix">
            <div class="hint-text">Hiển thị <b> 5</b> trong số <b>100</b> mục</div>
            <ul class="pagination">
                <li class="page-item disabled"><a href="#">Previous</a></li>
                <li class="page-item"><a href="#" class="page-link">1</a></li>
                <li class="page-item"><a href="#" class="page-link">2</a></li>
                <li class="page-item active"><a href="#" class="page-link">3</a></li>
                <li class="page-item"><a href="#" class="page-link">4</a></li>
                <li class="page-item"><a href="#" class="page-link">5</a></li>
                <li class="page-item"><a href="#" class="page-link">Next</a></li>
            </ul>
        </div>
    </div>
</div>

<div id="editServiceModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form>
                <div class="modal-header">
                    <h4 class="modal-title">Edit Employee</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body list">
                    <ul class="scroll-page">
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
                                <input type="text" class="form-control" required>
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
                                <textarea class="form-control" required></textarea>
                            </div>
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
                <div class="modal-footer">
                    <input type="button" class="btn btn-danger" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-info" value="Save">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Delete Modal HTML-->
<div id="deleteServiceModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="../customer" method="post">
                <div class="modal-header">
                    <h4 class="modal-title">Delete Service</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Are you sure you want to delete these Records?</p>
                    <p class="text-warning"><small>This action cannot be undone.</small></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-dark" data-dismiss="modal" value="Cancel">
                    <a href="customer?action=delete&id=${customer.id}"><input type="submit" class="btn btn-danger" value="Delete"></a>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
