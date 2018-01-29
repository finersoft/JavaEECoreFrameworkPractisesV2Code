<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadTest.action" method="post"
		enctype="multipart/form-data">
		username:<input type="text" name="tools.username"><br /> file:<input
			type="file" name="tools.uploadFile"><br /> 
			file:<input
			type="file" name="tools.uploadFile"><br />
			file:<input
			type="file" name="tools.uploadFile"><br />
			file:<input
			type="file" name="tools.uploadFile"><br /><input type="submit"
			value="submit"><br />
	</form>
</body>
</html>