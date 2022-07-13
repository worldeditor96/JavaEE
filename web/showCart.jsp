<%@ page import="somePackage.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Boss & МА
  Date: 13.07.2022
  Time: 4:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
        <%@ page import="somePackage.Cart" %>

        <% Cart cart = (Cart) session.getAttribute("cart"); %>

        <p> Наименование: <%= cart.getName()%> </p>
        <p> Количество: <%= cart.getQiantity()%> </p>
</body>
</html>
