<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/24/024
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
</head>

<% pageContext.setAttribute("ctx",request.getContextPath());%>
<body>
<a href="${ctx}/json">getUserInfo</a>
<div></div>
<script type="text/javascript">
    $("a:first").click(function () {
        $.ajax({
            url:"${ctx}/json",
            type:"GET",
            success:function (data) {
                //console.log(data)
                $.each(data,function () {
                    var user = this.id + "--" + this.name + "--" + this.age + "--" + this.gender;
                    $("div").append(user + '</br>');
                })
            }
        });
        return false;
    });

</script>
</body>


</html>
