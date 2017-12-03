<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="../js/angular.js"></script>

<script type="text/javascript">
var ap=angular.module('buttnNgApp',[]);

console.log('ng app started ='+ap);
ap.controller('btnClick',['$scope',function($scope) {
	
	$scope.angularButtnCLickck=function() {
		console.log('button clicked');
		
		
	};
	
	
}                     
                          
                          
                          
                          ]);


</script>


</head>
<body ng-app="buttnNgApp" ng-controller="btnClick">

<button ng-click="angularButtnCLickck()">angular angularButtnCLickck()</button>

</body>
</html>