<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>   
<tiles:insertDefinition name="base.default">
    <tiles:putAttribute name="body"  >
        <div class="main">
          <div class="container" style="background: #FFFFFF">
            <div class="theme-showcase" >
                <div class="jumbotron">
                    hello world
                </div>
            </div>      
            <div>
           	    <div class="row ">
                    <div class="col-sm-8 ">
                        <tiles:insertDefinition name="base.default.blogList" />        
                    </div>
                    <div class="col-sm-4 ">
                        <tiles:insertDefinition name="base.default.sideBar"  />  
                    </div>
                </div>
            </div>
           </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>