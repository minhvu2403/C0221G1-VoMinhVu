<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 26/05/2021
  Time: 8:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <link rel="stylesheet" href="css/customer.css">
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
                    <a href="creat_customer.html" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Customer</span></a>
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
                <th>Date of birth</th>
                <th>Phone number</th>
                <th>Email</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <span class="custom-checkbox">
                        <input type="checkbox" id="checkbox1" name="options[]" value="1">
                        <label for="checkbox1"></label>
                    </span>
                </td>
                <td>001</td>
                <td>MinhVu</td>
                <td>150</td>
                <td>12.40 USD</td>
                <td>Phong 2</td>
                <td>Phong 2</td>
                <td>Phong 2</td>


                <td>
                    <a href="#editServiceModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                    <a href="#deleteServiceModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                </td>
            </tr>
            <tr>
                <td>
                             <span class="custom-checkbox">
                                 <input type="checkbox" id="checkbox2" name="options[]" value="1">
                                 <label for="checkbox2"></label>
                             </span>
                </td>
                <td>001</td>
                <td>MinhVu</td>
                <td>150</td>
                <td>12.40 USD</td>
                <td>Phong 2</td>
                <td>Phong 2</td>
                <td>Phong 2</td>

                <td>
                    <a href="#editServiceModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                    <a href="#deleteServiceModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                </td>
            </tr>
            <tr>
                <td>
                             <span class="custom-checkbox">
                                 <input type="checkbox" id="checkbox3" name="options[]" value="1">
                                 <label for="checkbox3"></label>
                             </span>
                </td>
                <td>001</td>
                <td>MinhVu</td>
                <td>150</td>
                <td>12.40 USD</td>
                <td>Phong 2</td>
                <td>Phong 2</td>
                <td>Phong 2</td>

                <td>
                    <a href="creat_customer.html" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                    <a href="#deleteServiceModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                </td>
            </tr>
            <tr>
                <td>
                             <span class="custom-checkbox">
                                 <input type="checkbox" id="checkbox4" name="options[]" value="1">
                                 <label for="checkbox4"></label>
                             </span>
                </td>
                <td>001</td>
                <td>MinhVu</td>
                <td>150</td>
                <td>12.40 USD</td>
                <td>Phong 2</td>
                <td>Phong 2</td>
                <td>Phong 2</td>


                <td>
                    <a href="#editServiceModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                    <a href="#deleteServiceModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                </td>
            </tr>
            <tr>
                <td>
                             <span class="custom-checkbox">
                                 <input type="checkbox" id="checkbox5" name="options[]" value="1">
                                 <label for="checkbox1"></label>
                             </span>
                </td>
                <td>001</td>
                <td>MinhVu</td>
                <td>150</td>
                <td>12.40 USD</td>
                <td>Phong 2</td>
                <td>Phong 2</td>
                <td>Phong 2</td>


                <td>
                    <a href="#editServiceModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                    <a href="#deleteServiceModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                </td>
            </tr>
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
<%-- edit Modal HTML--%>
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
            <form>
                <div class="modal-header">
                    <h4 class="modal-title">Delete Service</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Are you sure you want to delete these Records?</p>
                    <p class="text-warning"><small>This action cannot be undone.</small></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
