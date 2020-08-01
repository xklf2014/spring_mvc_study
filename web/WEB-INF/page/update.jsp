<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/1/001
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<% pageContext.setAttribute("ctx",request.getContextPath()); %>
<body>
<form action="${ctx}/updateUser" method="post">
    <input type="hidden" name="id" value="1">
    name:<input type="text" name="name"><br>
    password:<input type="text" name="password"><br>
    age:<input type="text" name="age"><br>
    <input type="submit" value="submit">

</form>
</body>
</html>
