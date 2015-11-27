<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
        <tiles:insertAttribute name="title" ignore="true" />
        <tiles:insertAttribute name="meta" ignore="true" />
        <tiles:insertAttribute name="style" ignore="true" />
    </head>  
    <body>
        <tiles:insertAttribute name="body" ignore="true" />
    </body>
        <tiles:insertAttribute name="script" ignore="true" />
</html>  