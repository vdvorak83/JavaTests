<%--
  Created by IntelliJ IDEA.
  User: O'win
  Date: 22.02.2018
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tutor User Statistic</title>

    <link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
    <link href="/css/tutor/tableStyle.css" rel="stylesheet">
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Ф.И.О.</th>
        <th>Пройдено всего</th>
        <th>Правильно</th>
        <th>Неправильно</th>
    </tr>
    </thead>
    <c:forEach items="" var="user">
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
</table>
<a class="btn btn-primary" href="/getStatistics">Назад</a>
</body>
</html>