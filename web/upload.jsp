<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/25/025
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<% pageContext.setAttribute("ctx",request.getContextPath()); %>
<body>

<form method="post" action="${ctx}/upload" enctype="multipart/form-data">
     文件:<input type="file" name="file">
     描述:<input type="text" name="desc">
    <input type="submit" value="submit">
</form>
</body>
</html>
