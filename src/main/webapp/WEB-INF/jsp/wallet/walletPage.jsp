<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app>
<head>
    <title></title>
    <script src="<%=request.getContextPath()%>/static/assets/angular/angular.min.js" ></script>
</head>
<body>
<hr>
<input type="text" ng-model="plusOne"> + <input type="text" ng-model="plusTwo"> = {{ plusOne + plusTwo }}
</body>
</html>
