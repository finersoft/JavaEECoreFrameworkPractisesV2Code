<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	${requestScope.requestKey1}
	<br /> ${requestScope.requestKey2}
	<br /> ${sessionScope.sessionKey}
	<br /> ${applicationScope.applicationKey}
	<br />
</body>
</html>