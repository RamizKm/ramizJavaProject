<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="../js/angular.js">

var ang=angular.module('myngapp','[]');

ang.controller('httptest',function($scope,$http){
	
console.log('ng app testing');
$scope.testScopepName="testing data";

});

		</script>
</head>

<body ng-app="myngapp" ng-controller="httptest">

<input  type="text" ng-model="myNameIn">


{{myNameIn|uppercase} <br/>

{{testScopepName}}


</body>



</html>