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

app.controller('myNgControllRest',function($scope,$http){
console.log('controller called');	

var partyarr=[];

$scope.myRetriveParty=function(){
	
	$http.get('http://localhost:8080/zRamizRestWebWork/rest/v1/parties').then(function(response){
		console.log('call to successful rest'+response.data);
	
	$scope.partyarr=response.data;
	console.log('response part='+$scope.partyarr);
	
	},function(response) {
		console.log('error has occured');
		console.log(response.statusText);
		
	})
	
}
});








</script>

</head>
<body  ng-app="myNgApp"  >

<div ng-controller="myNgControllRest">


<button ng-click="myRetriveParty()">retrieveParty</button>

{{partyarr}}
<br/>
rest response list iterator
<ul>
<li ng-repeat='x in partyarr'>

{{x.party.firstName}}-- {{x.party.secondName}} -- {{x.partypartyType}}--{{x.party.inputNotPresent}}
 </li>


</ul>


</div>


</body>
</html>