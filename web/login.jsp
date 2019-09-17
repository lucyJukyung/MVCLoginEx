<%--
  Created by IntelliJ IDEA.
  User: lucy
  Date: 17/9/19
  Time: 12:26 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="LoginServlet" method="get"><p>
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
</p>
    <p>
        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>
    </p>
    <button type="submit">Login</button>
</form>
</body>
</html>
