<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/29/029
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%
    pageContext.setAttribute("ctx",request.getContextPath());
%>
<body>

<form action="${ctx}/hello/hello1" method="post">
    <input type="text" name="username">
    <input type="submit" value="提交">
</form>

<form action="${ctx}/user" method="post">
    <input type="submit" value="save">
</form>

<form action="${ctx}/user" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="update">
</form>

<form action="${ctx}/user" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="delete">
</form>

<a href="${ctx}/user">search</a>

</body>
</html>
