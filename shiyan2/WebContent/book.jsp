<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>详细信息</title>
</head>
<body>
	<h3>这些是图书的信息！</h3>
	
	<table width="666" height="233" border="1">
    <tr>
      <td colspan="7"><strong>图书信息</strong></td>
    </tr>
    <tr>
      <td>ISBN</td>
      <td>Title</td>
      <td>Publisher</td>
      <td>PublishDate</td>
      <td>Price</td>
    </tr>
    <tr>
      <td><%out.println(request.getParameter("id0")); %></td>
      <td><%out.println(request.getParameter("id1")); %></td>
      <td><%out.println(request.getParameter("id3")); %></td>
      <td><%out.println(request.getParameter("id4")); %></td>
      <td><%out.println(request.getParameter("id5")); %></td> 
    </tr>
  </table>
	
	<h3>这些是作者的信息！</h3>
	<table width="666" height="233" border="1">
    <tr>
      <td colspan="7"><strong>作者信息</strong></td>
    </tr>
    <tr>
      <td>AuthorID</td>
      <td>Name</td>
      <td>Age</td>
      <td>Country</td>
    </tr>
    <tr>
      <td><%out.println(request.getParameter("id2")); %></td>
      <td><%out.println(request.getParameter("id6")); %></td>
      <td><%out.println(request.getParameter("id7")); %></td>
      <td><%out.println(request.getParameter("id8")); %></td>
    </tr>
  </table>
	<!--  -->
	<form action="login">
		<input type="hidden" name="username" value="<s:property value="#parameters.id6"/>"/>
		<input type="submit" value="回到书目列表"/>
	</form>
	
</body>

</html>