<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>哇 搜到啦</title>
</head>
<body>
	本站访问次数为：${applicationScope.counter }
	<br /> 有关${sessionScope.user }的图书信息出来咯。
	<br /> AuthorID是${requestScope.tip }！
	
	<table width="666" height="233" border="1">
    <tr>
      <td colspan="7"><strong>图书信息</strong></td>
    </tr>
    <tr>
      <td>ISBN</td>
      <td>Title</td>
      <td>AuthorID</td>
      <td>Publisher</td>
      <td>PublishDate</td>
      <td>Price</td>
      <td>opt</td>
    </tr>
    <s:iterator value="list" status="st">
    <tr>
      <td><a href="book.jsp?id0=<s:property value="ISBN"/>&id1=<s:property value="Title"/>&id2=<s:property value="AuthorID"/>&id3=<s:property value="Publisher"/>&id4=<s:property value="date"/>&id5=<s:property value="price"/>&id6=<s:property value="aname"/>&id7=<s:property value="age"/>&id8=<s:property value="country"/>"> <s:property value="ISBN" /> </a> </td>
      <td><s:property value="Title"/></td>
      <td><s:property value="AuthorID"/></td>
      <td><s:property value="Publisher"/></td>
      <td><s:property value="date"/></td>
      <td><s:property value="price"/></td>
   	  <td> 
	  	<form action="del.action">
	  		<input type="hidden" name="delname" value="<s:property value="Title"/>"/>
	  		<input type = "submit" value="删除"/>
	  	</form>
	  </td>
   	 
    </tr>
    </s:iterator>
  </table>
	
	<form action="homepage.action">
		<input type="submit" value="回到咨询界面"/>
	</form>
</body>
</html>