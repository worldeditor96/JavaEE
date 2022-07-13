<%--
  Created by IntelliJ IDEA.
  User: Boss & МА
  Date: 12.07.2022
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1> Testing jsp</h1>

    <p>
        <%
        String name = request.getParameter("name");
            String surename = request.getParameter("surename");
        %>

        <%= "hello, " + name + surename + " Welcom"%>
    </p>



</body>
</html>
