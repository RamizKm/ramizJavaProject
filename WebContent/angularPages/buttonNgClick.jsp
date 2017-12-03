<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<script type="text/javascript" src="../js/angular.js"></script>
<script type="text/javascript">

var app=angular.module('clickNgAPp',[]);


app.controller("ngControllerBttn",function($scope){
	console.log('conroller started');

	$scope.smpleButtonCall=function() {
		console.log('button is clicked');
		
		
	};
	


});





</script>





</head>


<body ng-app="clickNgAPp" ng-controller="ngControllerBttn">


<button ng-click="smpleButtonCall"> button call example</button>

</body>
</html>