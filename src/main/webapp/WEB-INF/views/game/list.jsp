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
            <script lang="javascript">

                var app = angular.module("myApp", []);

                app.controller("myController", ["$scope", "$http", "$interval", function ($scope, $http, $interval) {

                        $interval(function () {

                            $http({
                                method: "GET",
                                url: "<c:url value="/game/ajax_list" />"
                            }).then(function callbackOK(response){
                                $scope.games = response.data;
                            });
                        }, 3000);
                    }]);

        </script>
    </head>
    <body ng-controller="myController">
        <div class="title">
            <c:import url="/_TITLE.jsp" />
        </div>
        <div class="menu">
            <c:import url="/_MENU.jsp" />
        </div>
        <div class="content">
            <table align="center">
                <thead>
                    Rejoignez une partie
                </thead>
                <th>Joueurs</th>
                <th>Démarrer</th>
                <tbody>
                    <tr ng-repeat="game in games">
                        <td>{{game.players.length}}</td>
                        <td>
                            <button>Démarrer</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="footer">
            <c:import url="/_FOOTER.jsp" />
        </div>
    </body>
</html>
