<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="console.default">
    <tiles:putAttribute name="consoleBoard">
        <div class="container">
            <table id="blogList" class="table table-striped table-bordered table-hover dataTable no-footer">      
                <thead>            
                    <tr>                
                        <th>GUID</th>                
                        <th>Title</th>                
                        <th>Author</th>              
                        <th>Time</th>             
                    </tr>    
                </thead>
                <tbody>
                    <c:forEach items="${articleList}" var="data">
                    <tr>
                        <td>${data.guid}</td>
                        <td><a href="/console/${data.guid}/articleUpdatePage">${data.title}</a></td>
                        <td>${data.arthor}</td>
                        <td><fmt:formatDate value="${data.insertTime}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                    </tr>
                    </c:forEach>

                </tbody>
            </table>
            <a href="/console/articleInsertPage">新增</a>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>

<!-- PAGE RELATED PLUGIN(S) -->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/dataTables.colVis.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/dataTables.tableTools.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatables/dataTables.bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/datatable-responsive/datatables.responsive.min.js"></script>

<script>
    $(document).ready(function() {
        $('#blogList').dataTable({
            "aoColumns": [                          //设定各列宽度
                {"sWidth": "30%"},
                {"sWidth": "35%"},               //设定各列宽度
                {"sWidth": "15%"},
                {"sWidth": "20%"}
            ],
            "columnDefs": [
                {
                    "targets": [ 0 ],
                    "visible": false,
                    "searchable": false
                }
            ],
            "order": [[ 3, "desc" ]]
        });
    });


</script>