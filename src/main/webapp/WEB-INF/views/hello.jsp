<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"/>
    <script src="${pageContext.request.contextPath}/static/js/test.js"></script>
    <title>Assessment System</title>
</head>
<body>
<div class="row">
    <div class="col-sm-6 col-sm-offset-3">
        <p>
            Hello, ${pageContext.request.remoteUser}!
        </p>
        <p>
            Path variable - ${message}
        </p>
        <c:url var="logoutUrl" value="/logout"/>
        <form class="form-inline" action="${logoutUrl}" method="post">
            <input type="submit" value="Log out"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        </form>
    </div>
</div>
</body>
</html>
