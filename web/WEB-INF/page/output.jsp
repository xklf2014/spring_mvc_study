<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/1/001
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<% pageContext.setAttribute("ctx",request.getContextPath()); %>
<body>
hello<br>
page:${pageScope.msg}<br>
request:${requestScope.msg}<br>
session:${sessionScope.msg}<br>
application:${applicationScope.msg}<br>
<br>
session:${sessionScope.name}

</body>
</html>
