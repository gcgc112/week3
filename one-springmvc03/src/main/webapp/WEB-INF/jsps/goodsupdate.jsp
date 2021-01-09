<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
update.....
${name}
<form>
    <p>id<input value="${goods.gid}"></p>
    <p>name<input value="${goods.gname}"></p>
    <p>price<input value="${goods.gprice}"></p>
    <p>desc<input value="${goods.gdesc}"></p>
</form>
</body>
</html>
