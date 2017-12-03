<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NewStudentRegisteration.jsp</title>

<script type="text/javascript" src="../js/angular.js"></script>
</head>
<body ng-app="registerApp" ng-controller="registerationController">

{{welcomeMsg}}

FirstName<input type="text" ng-model="firstName" ></input>
<br/>
Parents MObile No <input type="text" ng-model="mobileNo"> </input>
<br/>
Address <input type="text" ng-model="address"></input>
<br/>
Parent Name <input type="text" ng-model="ParentName"></input>
<br/>
<input type="button" value="submit details" onclick="normalBUtton()"/>
<!-- call it like javascrpt function -->
<button ng-click="validateStdDetails()" value="button tag"  name="buttonDdkd" title="button tag dkd"> button tag </button>
</body>
<script type="text/javascript">
var appd=angular.module("registerApp",[]);
console.log(appd);


function normalBUtton() {
	
	console.log('normal button clicked');
	
}

appd.controller("registerationController",['$scope',function($scope){
	console.log('controller started');
	
	console.log('in controller');
	$scope.welcomeMsg="Welcome to school of wisdom and efforts";
	
	var dkdk=$scope.validateStdDetails;
	console.log('button details='+dkdk);
	
	$scope.validateStdDetails=function() {
		console.log('ramiz log');
		console.log('onclick started');
		
		
		
	};
	console.log('outside click function');
	
	
	
}]);
console.log('after controller');

</script>

</html>