<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/25/025
  Time: 7:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
<% pageContext.setAttribute("ctx",request.getContextPath());%>
<body>

<form action="${ctx}/testRequest" method="post">
    <input name="username" value="zhangsan">
    <input name="password" value="123456">
    <input type="file" name="file">
    <input type="submit" value="submit">
</form>

<a href="${ctx}/testRequestJson">send json data</a>

</body>


<script type="text/javascript">
    $("a:first").click(function () {
        var user = {id:"1",name:"zhangsan",age:"20",gender:"man"};
        var jsonuser = JSON.stringify(user);
        $.ajax({
            url:"${ctx}/testRequestJson",
            type:"post",
            data:jsonuser,
            contentType:"application/json",
            success:function (data) {
                alert(data)
            }
        });
        return false;
    })
</script>
</html>
