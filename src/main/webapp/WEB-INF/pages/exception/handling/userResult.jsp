<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<html>
<head>
    <title>Spring MVC Exception Handling</title>
</head>
<body>
    <h2>Search User</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${u.name}</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>${u.lastName}</td>
        </tr>
    </table>
</body>
</html>