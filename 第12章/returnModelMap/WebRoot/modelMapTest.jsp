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
	<br />
	<c:forEach var="eachString" items="${xxxxxxxxxxxxxx}">
	${eachString}<br />
	</c:forEach>
</body>
</html>