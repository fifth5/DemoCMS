<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app>
<head>
    <title></title>
    <script src="<%=request.getContextPath()%>/static/assets/angular/angular.min.js" ></script>
</head>
<body>
Your name: <input type="text" ng-model="yourname" placeholder="World">
<hr>
Hello {{yourname || 'World'}}!
中文
</body>
</html>
