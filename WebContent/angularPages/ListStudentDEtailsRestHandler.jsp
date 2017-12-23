<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="../js/angular.js"></script>

<script type="text/javascript">


var ap=angular.module("ListNgApp",[]);

ap.controller('llistStudentDetails',["$scope","$http",function($scope,$http) {
	console.log('conroller started');
	
	$scope.welcomePage="Welcome to world of array angular";
	
	$scope.callListStudentDtails=function() {
		console.log('callstudentadtilas started');
	
	$http.get('http://localhost:8080/ramizJavaProject/rest/ListStudentDEtailsRestHandler/getAllStudentDteails/vibgyor').
	then(function(response){
		console.log('successs');
		$scope.studentList=response.data;
		
		console.log($scope.studentList);
		
	},function(response) {
		
		console.log('error occured');
		console.log(response.status);
		
	});
	
	
	};
	
	
	
}     ]);



</script>


</head>
<body ng-app="ListNgApp" ng-controller="llistStudentDetails">

{{welcomePage}}
<div style="background-color:cyan;">
	<li ng-repeat="x in studentList">
	x.address <br/>   x.name <br/> x.mobileNO <br/>
	</li>
</div>

<button ng-click="callListStudentDtails()">call again fucntion</button>

</body>
</html>