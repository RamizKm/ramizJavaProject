<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<script type="text/javascript">
var app=angular.module('listngapp',[]);

app.controller('listPojoResponse',function($scope,$http){
console.log('controller called');	

var partyarr=[];

$scope.myRetriveParty=function(){
	
	$http.get('http://localhost:8080/zRamizRestWebWork/ListPojoService/getList').then(function(response){
		console.log('call to successful rest'+response.data);
	
	$scope.listResponse=response.data;
	console.log('response part='+$scope.listResponse);
	
	},function(response) {
		console.log('error has occured');
		console.log(response.statusText);
		
	})
	
}
});

</script>

</head>
<body ng-app="listngapp">

<div ng-controller="listPojoResponse">

response from rest service={{listResponse}}


</div>

</body>
</html>