<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>File Upload With Servlet 3.1</h2>
	<!-- springmvc表单上传文件 -->
	<mvc:form modelAttribute="commonFile" action="${pageContext.request.contextPath}/upload/result"
        enctype="multipart/form-data">
        <table>
            <tr>
                <td>Choose File</td>
                <td><mvc:input type="file" path="file" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </mvc:form>
	<%-- <mvc:form modelAttribute="commonFile" action="/result/two"
        enctype="multipart/form-data">
        <table>
            <tr>
                <td>Choose File</td>
                <td><mvc:input type="file" path="file" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </mvc:form> --%>
    
    <!-- 普通上传文件 -->
	<!-- <form method="post" action="/result/one" enctype="multipart/form-data">
		<input type="file" name="file"> 
		<input type="submit" value="upload" />
	</form> -->
	<h3>Uploaded Information</h3>
	<table>
		<tr>
			<td>File Length:</td>
			<td>${fileLength}</td>
		</tr>
	</table>
</body>
</html>