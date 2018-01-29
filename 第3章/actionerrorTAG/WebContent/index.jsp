<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Object object = request.getAttribute("actionErrors");
		out.println(object.getClass().getName());
	%>

	<c:forEach var="eachMessage" items="${actionErrors}">${eachMessage}<br />
	</c:forEach>
	<br />
	<br />
	<s:actionerror cssClass="zzzzzzzzzzzz" />
	<br />
	<s:debug></s:debug>
	<br />
	<br />
	<form action="login.action" method="post">
		username:<input type="text" name="username"><br /> password:<input
			type="text" name="password"><br /> <input type="submit"
			value="submit"><br />
	</form>
</body>
</html>
