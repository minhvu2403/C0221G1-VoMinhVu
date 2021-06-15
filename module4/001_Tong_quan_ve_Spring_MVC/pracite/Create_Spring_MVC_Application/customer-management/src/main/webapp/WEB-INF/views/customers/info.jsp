<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/06/2021
  Time: 2:06 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.customer_management.service.CustomerService" %>
<%@page import="com.customer_management.service.CustomerServiceFactory" %>
<%@ page import="com.customer_management.model.Customer" %>
<%!
    private CustomerService customerService = CustomerServiceFactory.getInstance();
%>
<%
    Long id = Long.valueOf(request.getParameter("id"));
    Customer customer = customerService.findId(id);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customers" method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <input type="hidden" name="id" value="<%= customer.getId() %>">
        <table>
            <tr>
                <td>Id</td>
                <td>
                    <%= customer.getId() %>
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td>
                    <input type="text" name="name" value="<%= customer.getName() %>">
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <input type="text" name="email" value="<%= customer.getEmail() %>">
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    <input type="text" name="address" value="<%= customer.getAddress() %>">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
<a href="<c:url value="/WEB-INF/views/customers/list.jsp"/>">Back to list</a>.
</body>
</html>
