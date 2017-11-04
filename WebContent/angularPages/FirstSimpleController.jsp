<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FirstController</title>
<script type="text/javascript" src="../js/angular.js"></script>
<script type="text/javascript">
console.log('angular js controller');
 var app=angular.module("firstcontrol",[]);

 app.controller("firstController",function($scope) {
	 $scope.displayFirstTxt="first display of controller called";
	 $scope.displaySecond="display of second text from controller";
	 
	 
 } );
 

</script>
</head>
<body>
<div ng-app="firstcontrol" ng-controller="firstController">
{{displayFirstTxt}} <br/>

{{displaySecond}}

</body>

</body>
</html>