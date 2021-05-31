<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 30/05/2021
  Time: 3:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="../../view/user/css/list.css">
</head>
<body>
<div class="container">
    <div class="table-wrapper">
        <div class="table-title">
            <div class="row">
                <div class="col-sm-4">
                    <h2>Manage <b>User</b></h2>
                </div>
                <div class="col-sm-4">
                    <form action="" method="">
                        <div class="search-box">
                            <input class="search-txt" type="text" name="name" placeholder="Type to search">
                            <input type="hidden" name="action" value="search">
                            <a  class="search-btn" href="">
                                <button class="submit"> <i class="fa fa-search"></i> </button>
                            </a>
                        </div>
                    </form>

                </div>
                <div class="col-sm-4">
                    <a href="user?action=create" class="btn btn-success"><i class="material-icons">&#xE147;</i>
                        <span>Add New User</span></a>
                    <a href="#deleteServiceModal" id="btn" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xe92b;</i>
                        <span>Delete</span></a>
                </div>
            </div>
        </div>
        <table class="table table-striped table-hover" id="tableProduct">
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
                <th>Country</th>
                <th>Actions</th>
            </tr>
            </thead>

            <tbody class="bg-white">
            <c:forEach items='${user}' var="user">
                <tr>
                    <td>
                    <span class="custom-checkbox">
                        <input type="checkbox" id="${user.id}" name="checkbox"value="${user.id}">
                        <label for="${user.id}"></label>
                    </span>
                    </td>
                    <td><a href="user?action=view&id=${user.id}"><c:out value="${user.id}"></c:out></a></td>
                    <td><a href="user?action=view&id=${user.id}"><c:out value="${user.name}"></c:out></a></td>
                    <td><c:out value="${user.email}"/></td>
                    <td><c:out value="${user.country}"/></td>

                    <td>
                        <a href="user?action=edit&id=${user.id}" class="edit"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                        <a href="#deleteServiceModal" onclick="setIdDelete(${user.id})" class="delete"
                           data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<!-- Delete Modal HTML-->
<div id="deleteServiceModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Delete User</h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            </div>
            <div class="modal-body">
                <p>Are you sure you want to delete these Records?</p>
                <p class="text-warning"><small>This action cannot be undone.</small></p>
            </div>
            <div class="modal-footer">
                <input type="button" class="btn btn-dark" data-dismiss="modal" value="Cancel">
                <a href="" id="deleteList"><input type="button" class="btn btn-danger" value="Delete"></a>
            </div>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"
        integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF"
        crossorigin="anonymous"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../../js/index.js"></script>
<script language="JavaScript">
    document.getElementById('btn').onclick = function()
    {
        let checkbox = document.getElementsByName('checkbox');
        let result = "";


        for (let i = 0; i < checkbox.length; i++){
            if (checkbox[i].checked === true){
                result += ' [' + checkbox[i].value + ']';
            }
        }
        alert("checkbox: " + result);
    };
</script>
</body>

</html>
