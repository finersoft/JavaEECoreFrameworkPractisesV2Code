<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String fileName1 = URLEncoder.encode("中国.zip", "utf-8");
		fileName1 = fileName1.replace("%", "_");

		String fileName2 = URLEncoder.encode("aptana2.0.5.zip", "utf-8");
		fileName2 = fileName2.replace("%", "_");
	%>
	<a href="downloadFile.action?fileName=<%=fileName1%>">中国.zip</a>
	<br />
	<a href="downloadFile.action?fileName=<%=fileName2%>">aptana2.0.5.zip</a>
</body>
</html>