<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="console.default">
    <tiles:putAttribute name="consoleBoard">
        <div class="container">


            <c:forEach items="${bannerList}" var="data">
                ${data.guid}/${data.bannerId}/${data.bannerName}/${data.bannerURL}/${data.bannerViewName}/${data.resourceID}<br />
            </c:forEach>


        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>

<!-- PAGE RELATED PLUGIN(S) -->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/dataTables.colVis.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/dataTables.tableTools.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/dataTables.bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatable-responsive/datatables.responsive.min.js"></script>