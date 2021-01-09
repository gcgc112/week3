<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <%--引入js文件--%>
    <script src="js/jquery-3.4.1.js"></script>
</head>
<body>
<a href="noparameter.do?id=1002&name=lisi">请求时没有携带参数或携带参数</a>
<br>
<a href="first.do">重定向</a>
<hr>
<a href="modelAttribute.do">请求</a>
<a href="modelAttribute2.do">请求</a>
<hr>
<a href="header.do">测试请求头数据获取</a>
<hr>
<a href="javascript:func1()">测试RequestBody注解</a>
<script>
    //封装类似实体类的函数
    function Person(id, name, psex) {
        this.id = id;
        this.name = name;
        this.psex = psex;
    }

    //超链接点击执行的函数
    function func1() {
        //造实体类对象
        var p = new Person(1001, '猪八戒', '男');
        //转json串
        var jsonStr = JSON.stringify(p);
        alert(jsonStr);
        $.ajax({
            url: "requestbody.do",
            data: jsonStr,
            type: "post",
            dataType: "json",
            contentType: "application/json;charset=UTF-8",
            success: function (obj) {
                console.log(obj);
            }
        });
    }
</script>
<hr>
<a href="nocookie.do">第一次请求，没有自定义cookie</a>
</body>
</html>
