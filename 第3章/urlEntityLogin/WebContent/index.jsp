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
	<s:debug></s:debug>
	<%
		out.println(request.getLocale().getCountry());
	%>
	<s:text name="staticText"></s:text>
	<br />
	<br />
	<s:text name="staticTextParam">
		<s:param>中国</s:param>
		<s:param>123</s:param>
	</s:text>
	<br />
	<br />
	<form action="login.action" method="post">
		username:<input type="text" name="userinfo.username">${fieldErrors.username[0]}<br />
		password:<input type="text" name="userinfo.password">${fieldErrors.password[0]}<br />
		<input type="submit" value="submit"><br />
	</form>
</body>
</html>