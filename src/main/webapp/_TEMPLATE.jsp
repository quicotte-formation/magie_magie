<%-- 
    Document   : effacemoi
    Created on : 23 mars 2016, 07:59:04
    Author     : tom
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myApp">
    <head>
        <c:import url="/_HEAD.jsp"></c:import>
    </head>
    <body ng-controller="myController">
        <div class="title">
            <c:import url="/_TITLE.jsp" />
        </div>
        <div class="menu">
            <c:import url="/_MENU.jsp" />
        </div>
        <div class="content">
        </div>
        <div class="footer">
            <c:import url="/_FOOTER.jsp" />
        </div>
    </body>
</html>