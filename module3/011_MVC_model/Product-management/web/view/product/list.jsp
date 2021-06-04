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
    <link rel="stylesheet" href="../../view/product/css/list.css">
</head>
<body>
<div class="container">
    <div class="table-wrapper">
        <div class="table-title">
            <div class="row">
                <div class="col-sm-4">
                    <h2>Manage <b>Product</b></h2>
                </div>
                <div class="col-sm-4">
                    <form action="../product" method="post">
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
                    <a href="product?action=create" class="btn btn-success"><i class="material-icons">&#xE147;</i>
                        <span>Add New Product</span></a>
                    <a href="product?action=deleteAll" id="btn" class="btn btn-danger" onclick="forceStop()" data-toggle="modal"><i class="material-icons">&#xe92b;</i>
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
                <th>Price</th>
                <th>Amount</th>
                <th>ProductStatus</th>
                <th>Actions</th>
            </tr>
            </thead>
            <form action="../product" method="post">
            <tbody class="bg-white"><c:forEach items='${products}' var="product">
                <tr>
                    <td>
                    <span class="custom-checkbox">
                        <input type="checkbox" id="${product.id}" name="toBeDeleted"value="${product.id}">
                        <label for="${product.id}"></label>
                    </span>
                    </td>
                    <td><a href="product?action=view&id=${product.id}">${product.id}</a></td>
                    <td><a href="product?action=view&id=${product.id}">${product.name}</a></td>
                    <td>${product.price}</td>
                    <td>${product.amount}</td>
                    <td>${product.productStatus}</td>
                    <td>
                        <a href="product?action=edit&id=${product.id}" class="edit"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                        <a href="#deleteServiceModal" onclick="setIdDelete(${product.id})" class="delete"
                           data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
            </form>
        </table>
    </div>
</div>
<!-- Delete Modal HTML-->
<div id="deleteServiceModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Delete Product</h4>
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
    // document.getElementById('btn').onclick = function()
    // {
    //     let checkbox = document.getElementsByName('checkbox');
    //     let result = "";
    //
    //
    //     for (let i = 0; i < checkbox.length; i++){
    //         if (checkbox[i].checked === true){
    //             result += ' [' + checkbox[i].value + ']';
    //         }
    //     }
    //     alert("checkbox: " + result);
    // };
    // $(window).unload(function() {
    //     document.location.href='/test/dataentry';
    // });
    function forceStop()
    {

        let checkboxes = document.getElementsByName('toBeDeleted');
        let selected = new Array();
        for (let i=0; i<checkboxes.length; i++) {
            if (checkboxes[i].checked===true) {
                selected.push(checkboxes[i].value);
            }
        }
        for (let i=0 ;i<selected.length;i++){
            console.log(selected[i]);
        }



    }
</script>
</body>

</html>
