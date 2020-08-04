<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4/004
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>

<% pageContext.setAttribute("ctx",request.getContextPath()); %>
<body>

<%--<form action="${ctx}/validation" method="post">
    id:<input type="text" name="id">${errors.id}<br>
    name:<input type="text" name="name">${errors.name}<br>
    age:<input type="text" name="age">${errors.age}<br>
    gender:<input type="text" name="gender">${errors.gender}<br>
    birth:<input type="text" name="birth">${errors.birth}<br>
    email:<input type="text" name="email">${errors.email}<br>
    <input type="submit" value="submit">
</form>--%>

<%--<fr:form action="validation" method="post">
    id:<fr:input path="id"></fr:input><fr:errors path="id"></fr:errors><br>
    name:<fr:input path="name"></fr:input><fr:errors path="name"></fr:errors><br>
    age:<fr:input path="age"></fr:input><fr:errors path="age"></fr:errors><br>
    gender:<fr:input path="gender"></fr:input><fr:errors path="gender"></fr:errors><br>
    birth:<fr:input path="birth"></fr:input><fr:errors path="birth"></fr:errors><br>
    email:<fr:input path="email"></fr:input><fr:errors path="email"></fr:errors><br>
    <input type="submit" value="submit">
</fr:form>--%>

<fr:form action="${ctx}/validation"  method="post">
    id:<fr:input path="id"></fr:input><fr:errors path="id"></fr:errors> <br/>
    name:<fr:input path="name"></fr:input><fr:errors path="name"></fr:errors><br/>
    age:<fr:input path="age"></fr:input><fr:errors path="age"></fr:errors><br/>
    gender:<fr:input path="gender"></fr:input><fr:errors path="gender"></fr:errors><br/>
    birth:<fr:input path="birth"></fr:input><fr:errors path="birth"></fr:errors><br/>
    email:<fr:input path="email"></fr:input><fr:errors path="email"></fr:errors><br/>
    <input type="submit" value="submit">
</fr:form>
</body>
</html>
