<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="../js/angular.js"></script>

<script type="text/javascript">
var app=angular.module('listngapp',[]);
console.log('ng app started');
app.controller('listPojoResponse',function($scope,$http){
console.log('controller called');	

var sc=$scope;

var partyarr=[];

$scope.myRetriveParty=function(){
	console.log('retreive party started');
	$http.get('../rest/ListRestService/getCityNames').then(function(response){
		console.log('call to successful rest'+response.data);
	
	$scope.listResponse=response.data;
	console.log('response part='+$scope.listResponse);
	
	},function(response) {
		console.log('error has occured');
		console.log(response.statusText);
		
	})
	
}

('#textbutton').onClick=function() {
	console.log('it is called');
	sc.myRetriveParty();
	
}

console.log('call to java script function. need to take value in some function');
sc.myRetriveParty();

});


</script>

</head>
<body ng-app="listngapp">

<div ng-controller="listPojoResponse">

response from rest service={{listResponse}}

<button id="textbutton"  value="callajaxfunction"> </button>

</div>
</body>
</html>