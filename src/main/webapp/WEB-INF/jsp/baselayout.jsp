<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.democms.system.platform.framework.util.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>

<%  
String path = request.getContextPath();  
String basePath = request.getScheme() + "://"  
        + request.getServerName() + ":" + request.getServerPort()  
        + path + "/";  
%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- tile <put-attribute name="title" value="title" />-->  
    <title><tiles:insertAttribute name="title" /></title>  
    <!-- stylesheets 要和tiles <put-list-attribute name="stylesheets"> name 一致 -->  
    <!-- classname 定义类型 -->  
    <tilesx:useAttribute name="stylesheets" classname="java.util.List" />  
    <c:forEach items="${stylesheets}" var="src">  
      <link rel="stylesheet" type="text/css" href="<%=basePath %><c:url value='${src}.css' />" />  
    </c:forEach>  
    <tilesx:useAttribute id="scripts" name="scripts" classname="java.util.List" />  
    <c:forEach items="${scripts}" var="src">  
        <script type="text/javascript" src="<%=basePath %><c:url value='${src}.js' />"></script>  
    </c:forEach>  
    <title>Insert title here</title>
</head>
<body>
    <div id="head">  
    <div id="banner"></div>  
    <div id="menu"><jsp:include page="/WEB-INF/tiles/menu.jsp"/></div>      
    </div>  
    <!-- 加载 tiles main 指向的页面<put-attribute name="main" value="/WEB-INF/jsp/user/login/home.jsp" /> -->  
    <div id="main"><tiles:insertAttribute name="main" /></div>  
    <div id="footer"><jsp:include page="/WEB-INF/tiles/footer.jsp"/></div>
</body>
</html>