<%--
  Created by IntelliJ IDEA.
  User: anselme
  Date: 16/06/2022
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Todos are here ... </title>
</head>
<body>
<h1>All todos are here</h1>
<table>
    <thead>
    <tr>
        <th>ISBN</th>
        <th>Name</th>
        <th>Author</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.username}</td>
        </tr>
    </c:forEach>
    </tbody>
    <form action="/todos" method="post">
        <input type="text" name="title">
        <input type="text" name="description">
        <button type="submit">Add Todo</button>
    </form>
</table>
</body>
</html>
