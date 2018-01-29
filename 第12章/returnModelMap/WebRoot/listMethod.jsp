<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<%
		Enumeration enum1 = request.getAttributeNames();
		while (enum1.hasMoreElements()) {
			String key = (String) enum1.nextElement();
			out.println("key=" + key + "<br/>");
		}
	%>
	<br />
	<br /> A:
	<br />
	<c:forEach var="eachString" items="${stringList}">
	${eachString}<br />
	</c:forEach>
	<br />
	<br /> B:
	<br />
	<c:forEach var="eachString" items="${x}">
	${eachString}<br />
	</c:forEach>
</body>
</html>