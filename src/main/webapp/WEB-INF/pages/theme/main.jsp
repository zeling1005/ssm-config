<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Spring MVC Themes</title>
    <link rel="stylesheet" href="<spring:theme code="style"/>" type="text/css" />
</head>
<body>
Theme :
<a href="?theme=light">Light</a> - <a href="?theme=dark">Dark</a>
<br/>
</body>
</html>