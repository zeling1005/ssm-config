<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome to view mybatis test page.
	<form method="get" action="${pageContext.request.contextPath}/mybatis/listMybatisModel">
		<button type="submit">list</button>
	</form>
	<br />
	<form method="get" action="${pageContext.request.contextPath}/mybatis/deleteMybatisModel">
		<button type="submit">delete</button>
	</form>
	<br />
	<form method="get" action="${pageContext.request.contextPath}/mybatis/insertMybatisModel">
		<button type="submit">insert</button>
	</form>
</body>
</html>