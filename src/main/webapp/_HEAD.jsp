<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="<c:url value="/CSS/theme.css"/>" rel="stylesheet" type="text/css"/>
<script src="<c:url value="/JS/angular.js"/>" type="text/javascript"></script>
<script lang="javascript">
    
    var app=angular.module("myApp", []);
    
    app.controller("myController", ["$scope", "$http", function($scope, $http){
            
            $scope.titre = "Welcome";
    }]);
    
</script>