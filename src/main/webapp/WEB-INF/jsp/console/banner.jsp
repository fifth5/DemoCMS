<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="<%=request.getContextPath()%>/static/assets/jquery-2.1.3.js"></script>
</head>
<body>
    <div>
        <form name="bannerInfoForm">
            <div>

                <c:forEach items="${bannerList}" var="data">
                    ${data.guid}/${data.bannerId}/${data.bannerName}/${data.bannerURL}/${data.bannerViewName}/${data.resourceID}<br />
                </c:forEach>


            </div>
            <div>bannername:<input type="text" name="bannerName" /></div>
            <div><input type="button" onclick="bannerInsertClick()" value="submit" /></div>
        </form>
    </div>
</body>
<script type="text/javascript">
function bannerInsertClick(){

	$.ajax({
	    type: 'POST',
	    url: "<%=request.getContextPath()%>/console/banner/bannerInsert.json",
	    data: $("#bannerInfoForm").serialize() ,
	    success:function(data){
	    	alert(data);
	    }
	});

}

</script>
</html>