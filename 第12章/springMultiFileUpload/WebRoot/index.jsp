<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<form action="upload.spring" method="post"
		enctype="multipart/form-data">
		username:<input type="text" name="username"><br /> 
		file1:<input type="file" name="uploadFile1"><br />
		file2:<input type="file" name="uploadFile2"><br />
		file3:<input type="file" name="uploadFile3"><br />
		file4:<input type="file" name="uploadFile4"><br />
		file5:<input type="file" name="uploadFile5"><br />
		 <input
			type="submit" value="submit"><br />
	</form>
</html>