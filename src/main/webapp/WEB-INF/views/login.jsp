<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<c:url var="authUrl" value="/security_check"/>
<form method="post" action="${authUrl}">
    <label>
        Username:
        <input type="text" name="username"/>
    </label>
    <label>
        Password:
        <input type="password" name="password">
    </label>
    <input type="submit" name="submit" value="submit"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
