<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	post:
	<br />
	<form action="login.spring" method="post">
		username:<input type="text" name="username">${message.usernameisnull}<br />
		password:<input type="text" name="password">${message.passwordisnull}<br />
		<input type="submit" value="submit"><br />
	</form>
</body>
</html>