<%--
  Created by IntelliJ IDEA.
  User: lucy
  Date: 17/9/19
  Time: 12:26 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Error page</h1>
<p style="text-align:center">Sorry, <c:out value="${username}"/> are not a registered user! Please contact administrator</p>

</body>
</html>
