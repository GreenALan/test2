<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>插♂入界面</title>
</head>
<body>
	<form action="insauthor.action">
		<table align="center">
			<caption>
				作者的属性们
			</caption>
			<tr>
				<td>Name：<input type="text" name="aname" /></td>
				<td>Age：<input type="text" name="age" /></td>
				<td>Country：<input type="text" name="country" /></td>
			</tr>
			
			
			<tr align="center">
				<td><input type="submit" value="填完啦" /><input type="reset"
					value="重填" /></td>
			</tr>
		</table>
	</form>
<form action="homepage.action">
		<input type="submit" value="回到咨询界面"/>
	</form>
</body>
</html>