<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript" src="../js/angular.js"></script>

<script type="text/javascript">


var app=angular.module('myapp',[]);

app.controller('myrestCntrl',function($scope,$http) {
console.log('controller invoked');	
	$scope.resList=[];
	
	$scope.resRecList=[];
	
	$scope.callRestWeb=function() {
		$http.get('http://localhost:8080/zRamizRestWebWork/rest/v1/getList').
		then(function(response) {
			console.log('call to rest done');
		$scope.restResponse=response.data.records;	
		$scope.resList=response.data.records;
		
		$scope.resRecList=response.data;
		console.log('response='+$scope.resList);
		console.log('test response='+$scope.resRecList);
		
		
		$scope.responseMsg="Call to rest successful.";
		}, function(response){
			console.log('error handler');
			console.log(response.data);
			console.log(response.statusText);
		});
}
});


//dot is not needed, colon is needed




</script>



</head>
<body ng-app="myapp"  ng-controller="myrestCntrl">

{{restResponse}}
<br/>
Rest response={{resRecList}}


<ul>
<li ng-repeat='y in resRecList'>{{y}} </li>

</ul>


<br/>
msg from rest={{responseMsg}}

<ul>
<li ng-repeat='x in restResponse'>{{x}} </li>
</ul>

<button ng-click="callRestWeb()">rest call</button>

</body>
</html>