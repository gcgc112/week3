<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载页</title>
</head>
<body>
<%--列表展示--%>
下载页
<c:forEach items="${list}" var="file">
    <p><a href="download.do?filename=${file}">${file}</a></p>
</c:forEach>
</body>
</html>
