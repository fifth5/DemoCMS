<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="console.default">
    <tiles:putAttribute name="consoleBoard"  >
        <div>
            <form name="bannerInfoForm">
                <div>

                    <c:forEach items="${artcileList}" var="data">
                        ${data.guid}/<br />
                    </c:forEach>


                </div>
                <div>bannername:<input type="text" name="bannerName" /></div>
                <div><input type="button" onclick="bannerInsertClick()" value="submit" /></div>
            </form>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
<script>
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
