<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="../js/angular.js"></script>

<script type="text/javascript">
var app=angular.module('myNgApp',[]);

app.controller('retrieveControllerSampleFunction',function($scope,$http){
console.log('controller called');	

var partyarr=[];


var scp=$scope;
console.log('scp ='+scp);

console.log('retrieve party call finished');


$scope.myRetriveParty=function(){
	
	console.log('inside function');
	$http.get('http://localhost:8080/ramizJavaProject/rest/sampleRestFunction').then(function(response){
		console.log('call to successful rest'+response.data);
	
	$scope.partyarr=response.data;
	console.log('response part='+$scope.partyarr);
	
	},function(response) {
		console.log('error has occured');
		console.log(response.statusText);
		
	});
	
}

//call to angular function
scp.myRetriveParty();


});





</script>

</head>
<body ng-app="myNgApp">

<div id="retrieveControllerSampleFunction" ng-controller="retrieveControllerSampleFunction">

response from service ={{partyarr}}


</div>

</body>
</html>