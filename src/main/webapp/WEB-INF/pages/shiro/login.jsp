<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	shiro login view.
	<form method="post" action="${pageContext.request.contextPath}/shiro/login">
		用户名:<input type="text" name="username" /><br /> 
		用户密码:<input type="password" name="password" /><br /> 
		记住我:<input type="checkbox" name="rememberMe" value="true" /><br /> 
		<input type="submit" value="用户登录" />
	</form>
</body>
</html>