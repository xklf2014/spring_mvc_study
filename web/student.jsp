<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/30/030
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%
pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<form action="${ctp}/testStudent" method="post">
    id:<input type="text" name="id"> <br>
    name:<input type="text" name="name"><br>
    age:<input type="text" name="age"><br>
    province:<input type="text" name="address.province"><br>
    city:<input type="text" name="address.city"><br>
    town:<input type="text" name="address.town"><br>
    <input type="submit" value="save">
</form>
</body>
</html>
