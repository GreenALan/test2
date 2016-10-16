<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>来搜搜看吧</title>
</head>
<body>
	<form action="login.action" method="post">
		<table align="center">
			<caption>
				这个是搜作者
			</caption>
			<tr>
				<td>姓名：<input type="text" name="username" /></td>
			</tr>
			<!-- 
			<tr>
				<td>年&nbsp;&nbsp;龄:<input type="number" name="password" /></td>
			</tr>
			<tr>
				<td>国&nbsp;&nbsp;家:<input type="text" name="country" /></td>
			</tr>-->
			
			<tr align="center">
				<td><input type="submit" value="搜呀搜" /><input type="reset"
					value="重填" /></td>
			</tr>
		</table>
	</form>
	
	<table width="666" height="233" border="1" align="center">
    <tr>
      <td colspan="7" align="center"><strong>现在有这么多作者信息</strong></td>
    </tr>
    <tr>
      <td>AuthorID</td>
      <td>Name</td>
    </tr>
    <s:iterator value="alist" status="st">
    <tr>
      <td><s:property value="AuthorID"/></td>
      <td><s:property value="ISBN"/></td>
   	 
    </tr>
    </s:iterator>
    <tr align="center">
				<td colspan="7"><input type="button" value="点我插入新图书" onClick="window.location.href=&apos;insbook_page.jsp&apos;">
	            <input type="button" value="点我插入新作者" onClick="window.location.href=&apos;insauthor_page.jsp&apos;"></td>
			</tr>
  </table>
	
	
</body>
</html>