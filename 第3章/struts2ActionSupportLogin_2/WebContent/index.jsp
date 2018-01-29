<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println(request.getAttribute("fieldErrors").getClass().getName());
	%>
	<s:debug></s:debug>
	<br />
	<br />
	<form action="login.action" method="post">
		username:<input type="text" name="username">${fieldErrors.username[0]}<br />
		password:<input type="text" name="password">${fieldErrors.password[0]}<br />
		<input type="submit" value="submit"><br />
	</form>
</body>
</html>
