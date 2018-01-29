<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	${loginResult}
	<br />
	<form action="login.abc" method="post">
		username:<input type="text" name="username"><br /> password:<input
			type="text" name="password"><br /> <input type="submit"
			value="submit"><br />
	</form>
</body>
</html>