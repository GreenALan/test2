<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>插入成功</title>
</head>
<body>
	<br />捂脸（（插。。插进来了！
	<br />编号是<s:property value="result"/>
	<form action="homepage.action">
		<input type="submit" value="回到咨询界面"/>
	</form>
</body>
</html>