<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16/06/2021
  Time: 11:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
 <h2>List Student</h2>
 <a href="/student/create">Create new student</a>
 <p style="color: green">${msg}</p>
 <table border="1">
     <tr>
         <th>No</th>
         <th>Id</th>
         <th>Name</th>
         <th>DateOfBirth</th>
         <th colspan="2">Action</th>
     </tr>
     <c:forEach var="studentObj" items="${studentList}" varStatus="loop">
         <tr>
             <td>${loop.index+1}</td>
             <td>${studentObj.id}</td>
             <td>${studentObj.name}</td>
             <td>${studentObj.dateOfBirth}</td>
             <td><a href="/student/detail?idStudent=${studentObj.id}">Detail student PR</a></td>
             <td><a href="/student/detail/${studentObj.id}">Detail student PV</a></td>
         </tr>
     </c:forEach>
 </table>
</body>
</html>
