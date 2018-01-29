<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	
<body>
	<a
		href="downloadFile.spring?fileName=<%=java.net.URLEncoder.encode("中国.rar", "utf-8").toString().replace("%", "_")%>">中国.rar</a>
	<br />
	<a href="downloadFile.spring?fileName=postTest.rar">postTest.rar</a>
	<br />
</body>
</html>