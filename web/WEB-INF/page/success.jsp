<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/30/030
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% System.out.println("success page"); %>
success!!!

request:${requestScope.get("request")}
session:${sessionScope.get("session")}
</body>
</html>
