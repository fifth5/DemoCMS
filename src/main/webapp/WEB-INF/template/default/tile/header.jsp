<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div id="navbar" class="collapse navbar-collapse" >
            <ul class="nav navbar-nav">
                <c:forEach var="banner" items="${bannerList}" >
                    <li ><a href="#">${banner.bannerName}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</nav>



<script src="/static/default/script/js/banner.js" defer="defer"></script>
<script type="text/javascript">
    function getBannerList(){
        return '${bannerList}';
    }
</script>

