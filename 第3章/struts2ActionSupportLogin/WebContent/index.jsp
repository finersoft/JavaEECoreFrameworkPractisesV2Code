<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="login" method="post">
		<s:textfield name="username" label="账号"></s:textfield>
		<s:textfield name="password" label="密码"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
	<br />
	<br />
	<form action="login.action" method="post">
		username:<input type="text" name="username"><br /> password:<input
			type="text" name="password"><br /> <input type="submit"
			value="submit"><br />
	</form>
</body>
</html>
